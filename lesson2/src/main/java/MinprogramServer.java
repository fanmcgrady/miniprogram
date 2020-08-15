import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class MinprogramServer {

    public static void main(String[] args) throws Exception {
        int port = 8888;
        Server server = new Server(port);

        // 配置服务器
        WebAppContext context = new WebAppContext();
        context.setContextPath("/");
        context.setResourceBase("web"); // 指定根目录
        context.setDefaultsDescriptor("src/main/java/webdefault.xml");
        server.setHandler(context);

        server.start();
        server.join();
    }
}
