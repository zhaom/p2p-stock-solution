package com.solution.p2p.core.account;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-14
 * Time: 上午11:11
 * To change this template use File | Settings | File Templates.
 */
public class AccountServiceMain {

    public static void main(String[] args){
        String[] configLocation={"D:\\ideaSpace\\fanya-core\\account-service\\src\\main\\resources\\spring-config.xml",
                "D:\\ideaSpace\\fanya-core\\account-service\\src\\main\\resources\\spring-config-dubbo-provider.xml"};
        ApplicationContext context =new FileSystemXmlApplicationContext(configLocation);
        com.alibaba.dubbo.container.Main.main(args);
    }
}
