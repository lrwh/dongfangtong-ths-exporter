package com.lr.dongfangtong.ths.exporter.job;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lr.dongfangtong.ths.exporter.metrics.MetricDefinition;
import com.lr.dongfangtong.ths.exporter.service.HttpService;
import com.lr.dongfangtong.ths.exporter.vo.ServerZones;
import com.lr.dongfangtong.ths.exporter.vo.ThsVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class MetricJob {
    @Autowired
    private HttpService httpService;
    @Value("${ths.url}")
    private String thsUrl;
    private static final Logger logger = LoggerFactory.getLogger(MetricJob.class);
    @PostConstruct
    @Scheduled(cron = "${cron}")
    public void exec(){
        String result = null;
        try {
            result = httpService.sendRequest(thsUrl);
            logger.debug("result:",result);
        } catch (IOException e) {
            logger.error("获取数据异常",e);
        }
        JSONObject json = JSONObject.parseObject(result);


        ThsVo thsVo = json.toJavaObject(ThsVo.class);

        Gson gson = new Gson();
        HashMap<String, ServerZones> zoneInfoHashMap = new HashMap<>();
        HashMap<String, Object>  data = gson.fromJson(json.get("serverZones").toString(), new TypeToken<HashMap<String, Object>>() {}.getType());
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            zoneInfoHashMap.put(entry.getKey(),JSONObject.parseObject(JSONObject.toJSONString(entry.getValue()), ServerZones.class));
        }
        thsVo.setServerZones(zoneInfoHashMap);


        MetricDefinition.THS_INFO_UP.labels(thsVo.getHostName(),thsVo.getModuleVersion(),thsVo.getServerVersion()).set(thsVo.getNowMsec()-thsVo.getLoadMsec());


        MetricDefinition.THS_CONNECTIONS.labels(thsVo.getHostName(),"accepted").set(thsVo.getConnections().getAccepted());
        MetricDefinition.THS_CONNECTIONS.labels(thsVo.getHostName(),"active").set(thsVo.getConnections().getActive());
        MetricDefinition.THS_CONNECTIONS.labels(thsVo.getHostName(),"reading").set(thsVo.getConnections().getReading());
        MetricDefinition.THS_CONNECTIONS.labels(thsVo.getHostName(),"writing").set(thsVo.getConnections().getWriting());
        MetricDefinition.THS_CONNECTIONS.labels(thsVo.getHostName(),"waiting").set(thsVo.getConnections().getWaiting());
        MetricDefinition.THS_CONNECTIONS.labels(thsVo.getHostName(),"handled").set(thsVo.getConnections().getHandled());
        MetricDefinition.THS_CONNECTIONS.labels(thsVo.getHostName(),"requests").set(thsVo.getConnections().getRequests());


        MetricDefinition.THS_SHARED_ZONE_SIZE.labels(thsVo.getHostName(),thsVo.getSharedZones().getName(),"max").set(thsVo.getSharedZones().getMaxSize());
        MetricDefinition.THS_SHARED_ZONE_SIZE.labels(thsVo.getHostName(),thsVo.getSharedZones().getName(),"used").set(thsVo.getSharedZones().getUsedSize());
        MetricDefinition.THS_SHARED_ZONE_SIZE.labels(thsVo.getHostName(),thsVo.getSharedZones().getName(),"node").set(thsVo.getSharedZones().getUsedNode());



        for (Map.Entry<String, ServerZones> zone : thsVo.getServerZones().entrySet()) {
            String name = zone.getKey();
            if (name.equals("*")){
                name = "all";
            }
            MetricDefinition.THS_SERVER_ZONE_REQUEST.labels(thsVo.getHostName(),name,"counter").set(zone.getValue().getRequestCounter());
            MetricDefinition.THS_SERVER_ZONE_REQUEST.labels(thsVo.getHostName(),name,"msec").set(zone.getValue().getRequestMsec());
            MetricDefinition.THS_SERVER_ZONE_REQUEST.labels(thsVo.getHostName(),name,"msec_counter").set(zone.getValue().getRequestMsecCounter());

            MetricDefinition.THS_SERVER_ZONE_RESPONSE.labels(thsVo.getHostName(),name,"1xx").set(zone.getValue().getResponses().get_1xx());
            MetricDefinition.THS_SERVER_ZONE_RESPONSE.labels(thsVo.getHostName(),name,"2xx").set(zone.getValue().getResponses().get_2xx());
            MetricDefinition.THS_SERVER_ZONE_RESPONSE.labels(thsVo.getHostName(),name,"3xx").set(zone.getValue().getResponses().get_3xx());
            MetricDefinition.THS_SERVER_ZONE_RESPONSE.labels(thsVo.getHostName(),name,"4xx").set(zone.getValue().getResponses().get_4xx());
            MetricDefinition.THS_SERVER_ZONE_RESPONSE.labels(thsVo.getHostName(),name,"5xx").set(zone.getValue().getResponses().get_5xx());


            MetricDefinition.THS_SERVER_ZONE_OVER_COUNT.labels(thsVo.getHostName(),name,"1xx").set(zone.getValue().getOverCounts().get_1xx());
            MetricDefinition.THS_SERVER_ZONE_OVER_COUNT.labels(thsVo.getHostName(),name,"2xx").set(zone.getValue().getOverCounts().get_2xx());
            MetricDefinition.THS_SERVER_ZONE_OVER_COUNT.labels(thsVo.getHostName(),name,"3xx").set(zone.getValue().getOverCounts().get_3xx());
            MetricDefinition.THS_SERVER_ZONE_OVER_COUNT.labels(thsVo.getHostName(),name,"4xx").set(zone.getValue().getOverCounts().get_4xx());
            MetricDefinition.THS_SERVER_ZONE_OVER_COUNT.labels(thsVo.getHostName(),name,"5xx").set(zone.getValue().getOverCounts().get_5xx());
            MetricDefinition.THS_SERVER_ZONE_OVER_COUNT.labels(thsVo.getHostName(),name,"in").set(zone.getValue().getOverCounts().getInBytes());
            MetricDefinition.THS_SERVER_ZONE_OVER_COUNT.labels(thsVo.getHostName(),name,"out").set(zone.getValue().getOverCounts().getOutBytes());
            MetricDefinition.THS_SERVER_ZONE_OVER_COUNT.labels(thsVo.getHostName(),name,"counter").set(zone.getValue().getOverCounts().getRequestCounter());
            MetricDefinition.THS_SERVER_ZONE_OVER_COUNT.labels(thsVo.getHostName(),name,"msec_counter").set(zone.getValue().getOverCounts().getRequestMsecCounter());


            MetricDefinition.THS_SERVER_ZONE_TRAFFIC.labels(thsVo.getHostName(),name,"in").set(zone.getValue().getInBytes());
            MetricDefinition.THS_SERVER_ZONE_TRAFFIC.labels(thsVo.getHostName(),name,"out").set(zone.getValue().getOutBytes());
        }
        MetricDefinition.THS_SERVER_ZONE_REQUEST.labels(thsVo.getHostName(),"all","zones").set(thsVo.getServerZones().entrySet().size()-1);


    }
}
