package servlet;

import Bean.User;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");

        // 接收请求的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter output = response.getWriter();

        if ("zhangsan".equals(username) &&
                "123".equals(password)) {
            // 构建一个json数据
            User user = new User();
            user.setName("张三");
            user.setNumber("123");

            // 转成json对象
            JSONObject result = JSONObject.fromObject(user);

            output.println("登录成功：" + username + "欢迎你！");
            output.println("用户信息如下：" + result);
        } else {
            output.println("用户名密码错误，请重新输入！");
        }

    }
}
