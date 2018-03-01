package org.cn.plugin;

import org.junit.Test;

/**
 * Created by chenning on 2016/12/29.
 */
public class PluginTest {

    @Test
    public void test() throws Exception {
        PluginManager manager = new PluginManager();
        String pluginId = manager.install("test-classes.jar");
        manager.invoke(pluginId, "hello", "world");
        manager.uninstall(pluginId);
    }

}
