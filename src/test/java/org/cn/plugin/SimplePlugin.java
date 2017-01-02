package org.cn.plugin;

/**
 * Created by chenning on 2016/12/29.
 */
public class SimplePlugin implements Plugin {
    @Override
    public void onCreate() {
        System.out.println("Plugin onCreate");
    }

    @Override
    public void onDestroy() {
        System.out.println("Plugin onDestroy");
    }

    @Action(value = "hello")
    public void hello(String text) {
        System.out.println("Hello, " + text);
    }
}
