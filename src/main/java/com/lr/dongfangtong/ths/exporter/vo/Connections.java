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
public class Connections {

    private int active;
    private int reading;
    private int writing;
    private int waiting;
    private int accepted;
    private int handled;
    private int requests;
    public void setActive(int active) {
         this.active = active;
     }
     public int getActive() {
         return active;
     }

    public void setReading(int reading) {
         this.reading = reading;
     }
     public int getReading() {
         return reading;
     }

    public void setWriting(int writing) {
         this.writing = writing;
     }
     public int getWriting() {
         return writing;
     }

    public void setWaiting(int waiting) {
         this.waiting = waiting;
     }
     public int getWaiting() {
         return waiting;
     }

    public void setAccepted(int accepted) {
         this.accepted = accepted;
     }
     public int getAccepted() {
         return accepted;
     }

    public void setHandled(int handled) {
         this.handled = handled;
     }
     public int getHandled() {
         return handled;
     }

    public void setRequests(int requests) {
         this.requests = requests;
     }
     public int getRequests() {
         return requests;
     }

}