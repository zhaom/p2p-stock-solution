package com.solution.p2p.core.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-9-22
 * Time: 下午2:47
 * To change this template use File | Settings | File Templates.
 */
public class UserServiceMain {

    public static void main(String[] args){
        String[] configLocation={"D:\\ideaSpace\\fanya-core\\user-service\\src\\main\\resources\\spring-config.xml",
                "D:\\ideaSpace\\fanya-core\\user-service\\src\\main\\resources\\spring-config-dubbo-provider.xml"};
        ApplicationContext context =new FileSystemXmlApplicationContext(configLocation);
        com.alibaba.dubbo.container.Main.main(args);
    }
}
