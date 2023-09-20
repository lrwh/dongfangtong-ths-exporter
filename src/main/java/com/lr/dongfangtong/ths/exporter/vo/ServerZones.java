package com.lr.dongfangtong.ths.exporter.vo;

public class ServerZones {

    private Integer requestCounter;
    private Integer inBytes;
    private Integer outBytes;

    private Responses responses;

    private Integer requestMsecCounter;

    private Integer requestMsec;

    private OverCounts overCounts;

    public Integer getRequestCounter() {
        return requestCounter;
    }

    public void setRequestCounter(Integer requestCounter) {
        this.requestCounter = requestCounter;
    }

    public Integer getInBytes() {
        return inBytes;
    }

    public void setInBytes(Integer inBytes) {
        this.inBytes = inBytes;
    }

    public Integer getOutBytes() {
        return outBytes;
    }

    public void setOutBytes(Integer outBytes) {
        this.outBytes = outBytes;
    }

    public Responses getResponses() {
        return responses;
    }

    public void setResponses(Responses responses) {
        this.responses = responses;
    }

    public Integer getRequestMsecCounter() {
        return requestMsecCounter;
    }

    public void setRequestMsecCounter(Integer requestMsecCounter) {
        this.requestMsecCounter = requestMsecCounter;
    }

    public Integer getRequestMsec() {
        return requestMsec;
    }

    public void setRequestMsec(Integer requestMsec) {
        this.requestMsec = requestMsec;
    }

    public OverCounts getOverCounts() {
        return overCounts;
    }

    public void setOverCounts(OverCounts overCounts) {
        this.overCounts = overCounts;
    }
}
