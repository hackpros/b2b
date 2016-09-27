
 package com.jumore.b2b.activity.comm.zkclient;

import org.apache.curator.framework.CuratorFramework;

/**
 * curator zookeeper client的简单包装
 *
 * @author fanwg
 * @since b2b_activity_v1.0
 */
 public interface ZKClient
 {
     /**
      * 获取一个CuratorFramework
      * @return
      */
     CuratorFramework getClient();

    /**
     * 关闭CuratorFramework
     */
     void close();

 }