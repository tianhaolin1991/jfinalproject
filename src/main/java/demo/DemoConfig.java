package demo;

import com.jfinal.config.*;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class DemoConfig extends JFinalConfig {

    public static void main(String[] args) {
        UndertowServer.start(DemoConfig.class,80,true);
    }

    public void configConstant(Constants constants) {
        constants.setDevMode(true);
    }

    public void configRoute(Routes routes) {
        routes.setBaseViewPath("/WEB-INF");
        routes.add("/hello",HelloController.class).add("/",IndexController.class);
        routes.add("/registry",RegistryController.class);
    }

    public void configEngine(Engine engine) {

    }

    public void configPlugin(Plugins plugins) {
       /* DruidPlugin druidPlugin = new DruidPlugin("jdbc:mysql://192.168.25.125/test", "root", "root");
        plugins.add(druidPlugin);*/

    }

    public void configInterceptor(Interceptors interceptors) {

    }

    public void configHandler(Handlers handlers) {

    }
}
