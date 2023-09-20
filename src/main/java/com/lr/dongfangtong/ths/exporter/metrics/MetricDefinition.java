package com.lr.dongfangtong.ths.exporter.metrics;

import io.prometheus.client.Gauge;

public class MetricDefinition {

    public static final Gauge THS_INFO_UP = Gauge.build()
            .name("ths_info_up")
            .help("ths info")
            .labelNames("host","module_version","server_version")
            .register();


    public static final Gauge THS_CONNECTIONS = Gauge.build()
            .name("ths_connections")
            .help("ths connections")
            .labelNames("host","type")
            .register();
    public static final Gauge THS_SHARED_ZONE_SIZE = Gauge.build()
            .name("ths_shared_zone_size")
            .help("ths connections")
            .labelNames("host","name","type")
            .register();

    public static final Gauge THS_SERVER_ZONE_REQUEST = Gauge.build()
            .name("ths_server_zone_request")
            .help("ths shared")
            .labelNames("host","zone_name","type")
            .register();

    public static final Gauge THS_SERVER_ZONE_TRAFFIC = Gauge.build()
            .name("ths_server_zone_traffic")
            .help("ths shared")
            .labelNames("host","zone_name","type")
            .register();

    public static final Gauge THS_SERVER_ZONE_RESPONSE = Gauge.build()
            .name("ths_server_zone_response")
            .help("ths shared")
            .labelNames("host","zone_name","type")
            .register();

    public static final Gauge THS_SERVER_ZONE_OVER_COUNT = Gauge.build()
            .name("ths_server_zone_over_count")
            .help("ths shared")
            .labelNames("host","zone_name","type")
            .register();
}

