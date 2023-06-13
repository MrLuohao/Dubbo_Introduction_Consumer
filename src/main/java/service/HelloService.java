package service;

/**
 * @Title: HelloService
 * @Author Mr.罗
 * @Package service
 * @Date 2023/6/13 12:50
 * @description: 服务方接口（声明而已，具体实现会远程调用）dubbo_server的实现类
 */
public interface HelloService {

    String sayHello(String name);
}
