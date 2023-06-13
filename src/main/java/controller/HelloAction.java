package controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.HelloService;

/**
 * @Title: HelloAction
 * @Author Mr.罗
 * @Package controller
 * @Date 2023/6/13 12:47
 * @description: 控制层
 */
@Controller
public class HelloAction {

    /*@Reference采用了配置文件的方式就可以使用Autowired注解进行注入了*/ //去服务方将service的实现类远程注入进来
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String sayHi(String name) {
        return helloService.sayHello(name);
    }

    @GetMapping("/No")
    @ResponseBody
    public String No() {
        return helloService.sayNo();
    }
}
