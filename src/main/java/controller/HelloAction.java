package controller;

import com.alibaba.dubbo.config.annotation.Reference;
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

    @Reference //去服务方将service的实现类远程注入进来
    private HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String sayHi(String name) {
        return helloService.sayHello(name);
    }
}
