/**
  * Copyright 2023 bejson.com 
  */
package com.lr.dongfangtong.ths.exporter.vo;

/**
 * Auto-generated: 2023-09-15 10:8:18
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Localhost {

    private int requestCounter;
    private int inBytes;
    private int outBytes;
    private Responses responses;
    private int requestMsecCounter;
    private int requestMsec;
    private OverCounts overCounts;
    public void setRequestCounter(int requestCounter) {
         this.requestCounter = requestCounter;
     }
     public int getRequestCounter() {
         return requestCounter;
     }

    public void setInBytes(int inBytes) {
         this.inBytes = inBytes;
     }
     public int getInBytes() {
         return inBytes;
     }

    public void setOutBytes(int outBytes) {
         this.outBytes = outBytes;
     }
     public int getOutBytes() {
         return outBytes;
     }

    public void setResponses(Responses responses) {
         this.responses = responses;
     }
     public Responses getResponses() {
         return responses;
     }

    public void setRequestMsecCounter(int requestMsecCounter) {
         this.requestMsecCounter = requestMsecCounter;
     }
     public int getRequestMsecCounter() {
         return requestMsecCounter;
     }

    public void setRequestMsec(int requestMsec) {
         this.requestMsec = requestMsec;
     }
     public int getRequestMsec() {
         return requestMsec;
     }

    public void setOverCounts(OverCounts overCounts) {
         this.overCounts = overCounts;
     }
     public OverCounts getOverCounts() {
         return overCounts;
     }

}