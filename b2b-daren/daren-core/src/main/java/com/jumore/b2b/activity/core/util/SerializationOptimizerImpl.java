
 package com.jumore.b2b.activity.core.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

/**
 * dubbo kryo序列化时，用于加速序列化对象
 *
 * @author Shen, Shibang
 * @see [相关类/方法]（可选）
 * @since p2p_cloud_v1.0
 */
 public class SerializationOptimizerImpl implements SerializationOptimizer
 {

     @SuppressWarnings("rawtypes")
     public Collection<Class> getSerializableClasses()
     {
         List<Class> classes = new LinkedList<Class>();
         
         return classes;
     }

 }