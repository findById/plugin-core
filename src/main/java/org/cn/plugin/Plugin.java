package org.cn.plugin;

/**
 * Created by chenning on 2016/12/29.
 */
public interface Plugin {
    default void onCreate() {
    }

    default void onDestroy() {
    }

    default PluginStatus status() {
        return PluginStatus.RUNNING;
    }
}
