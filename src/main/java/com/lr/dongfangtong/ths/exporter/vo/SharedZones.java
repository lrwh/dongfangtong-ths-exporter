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
public class SharedZones {

    private String name;
    private long maxSize;
    private int usedSize;
    private int usedNode;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setMaxSize(long maxSize) {
         this.maxSize = maxSize;
     }
     public long getMaxSize() {
         return maxSize;
     }

    public void setUsedSize(int usedSize) {
         this.usedSize = usedSize;
     }
     public int getUsedSize() {
         return usedSize;
     }

    public void setUsedNode(int usedNode) {
         this.usedNode = usedNode;
     }
     public int getUsedNode() {
         return usedNode;
     }

}