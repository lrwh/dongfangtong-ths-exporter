/**
  * Copyright 2023 bejson.com 
  */
package com.lr.dongfangtong.ths.exporter.vo;

import java.util.HashMap;

/**
 * Auto-generated: 2023-09-15 10:8:18
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ThsVo {

    private String hostName;
    private String moduleVersion;
    private String serverVersion;
    private long loadMsec;
    private long nowMsec;
    private Connections connections;
    private SharedZones sharedZones;
    private HashMap<String, ServerZones> serverZones;
    public void setHostName(String hostName) {
         this.hostName = hostName;
     }
     public String getHostName() {
         return hostName;
     }

    public void setModuleVersion(String moduleVersion) {
         this.moduleVersion = moduleVersion;
     }
     public String getModuleVersion() {
         return moduleVersion;
     }

    public void setServerVersion(String serverVersion) {
         this.serverVersion = serverVersion;
     }
     public String getServerVersion() {
         return serverVersion;
     }

    public void setLoadMsec(long loadMsec) {
         this.loadMsec = loadMsec;
     }
     public long getLoadMsec() {
         return loadMsec;
     }

    public void setNowMsec(long nowMsec) {
         this.nowMsec = nowMsec;
     }
     public long getNowMsec() {
         return nowMsec;
     }

    public void setConnections(Connections connections) {
         this.connections = connections;
     }
     public Connections getConnections() {
         return connections;
     }

    public void setSharedZones(SharedZones sharedZones) {
         this.sharedZones = sharedZones;
     }
     public SharedZones getSharedZones() {
         return sharedZones;
     }

    public void setServerZones(HashMap<String, ServerZones>  serverZones) {
         this.serverZones = serverZones;
     }
     public HashMap<String, ServerZones>  getServerZones() {
         return serverZones;
     }

}