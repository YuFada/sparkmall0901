package com.atalibaba.sparkmall0901.common.utils

import java.io.InputStreamReader
import java.util.Properties

/**
  * @author :YuFada
  * @date ： 2019/2/16 0016 下午 15:44
  *       Description：
  */
object PropertiesUtil {
    def main(args: Array[String]): Unit = {
        val properties: Properties = PropertiesUtil.load("config.properties")

        println(properties.getProperty("kafka.broker.list"))
    }

    def load(propertieName: String): Properties = {
        val prop = new Properties();
        prop.load(new InputStreamReader(Thread.currentThread().getContextClassLoader.getResourceAsStream(propertieName), "UTF-8"))
        prop
    }
}



