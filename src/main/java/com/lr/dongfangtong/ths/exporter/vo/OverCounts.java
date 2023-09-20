/**
  * Copyright 2023 bejson.com 
  */
package com.lr.dongfangtong.ths.exporter.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Auto-generated: 2023-09-15 10:8:18
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class OverCounts {

    private int requestCounter;
    private int requestMsecCounter;
    private int inBytes;
    private int outBytes;
    @JSONField(name = "1xx")
    private Integer _1xx;
    @JSONField(name = "2xx")
    private Integer _2xx;
    @JSONField(name = "3xx")
    private Integer _3xx;
    @JSONField(name = "4xx")
    private Integer _4xx;
    @JSONField(name = "5xx")
    private Integer _5xx;

    public int getRequestCounter() {
        return requestCounter;
    }

    public void setRequestCounter(int requestCounter) {
        this.requestCounter = requestCounter;
    }

    public int getInBytes() {
        return inBytes;
    }

    public void setInBytes(int inBytes) {
        this.inBytes = inBytes;
    }

    public int getOutBytes() {
        return outBytes;
    }

    public void setOutBytes(int outBytes) {
        this.outBytes = outBytes;
    }

    public Integer get_1xx() {
        return _1xx;
    }

    public void set_1xx(Integer _1xx) {
        this._1xx = _1xx;
    }

    public Integer get_2xx() {
        return _2xx;
    }

    public void set_2xx(Integer _2xx) {
        this._2xx = _2xx;
    }

    public Integer get_3xx() {
        return _3xx;
    }

    public void set_3xx(Integer _3xx) {
        this._3xx = _3xx;
    }

    public Integer get_4xx() {
        return _4xx;
    }

    public void set_4xx(Integer _4xx) {
        this._4xx = _4xx;
    }

    public Integer get_5xx() {
        return _5xx;
    }

    public void set_5xx(Integer _5xx) {
        this._5xx = _5xx;
    }

    public int getRequestMsecCounter() {
        return requestMsecCounter;
    }

    public void setRequestMsecCounter(int requestMsecCounter) {
        this.requestMsecCounter = requestMsecCounter;
    }
}