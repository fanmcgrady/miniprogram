import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * 后端服务器，使用jetty搭建
 */
public class MinprogramServer {

    public static void main(String[] args) throws Exception {
        // 配置服务器的端口
        int port = 8888;
        Server server = new Server(port);

        // 配置服务器参数
        WebAppContext context = new WebAppContext();
        // 1、指定服务器的context
        context.setContextPath("/");
        // 2、指定静态页面根目录
        context.setResourceBase("web");

        // 将配置信息放入服务器中
        server.setHandler(context);

        // 启动服务器
        server.start();
        server.join();
    }
}
