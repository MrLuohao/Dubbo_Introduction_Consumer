package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestCheckException
 * @Author Mr.罗
 * @Package test
 * @Date 2023/6/13 17:10
 * @description: 启动时检查
 */
public class TestCheckException {
    public static void main(String[] args) throws Exception {
        //初始化spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring.xml");

        System.in.read();
    }
}
