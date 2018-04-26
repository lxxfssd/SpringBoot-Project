package com.gac.test01.service;

import com.gac.test01.dao.User01Mapper;
import com.gac.test02.dao.User02Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class User01Service {

    @Autowired
    private User01Mapper user01Mapper;

    @Autowired
    private User02Mapper user02Mapper;

    @Transactional
    public int addUser(String name, Integer age) {
//        user02Mapper.addUser(name, age);
//        int i = 1/0;
        user01Mapper.addUser(name, age);
        return 1;
    }

    @Async
    public void sedSms() {
        System.out.println("##sedSms##开始执行..  2");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("i:" + i);
        }
        System.out.println("##sedSms##结束执行..  3");
    }

    /**
     * 上面异步注解等同于放在线程里执行
     */
    class ThreadDemo extends Thread {
        @Override
        public void run() {

            System.out.println("##sedSms##开始执行..  2");
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                System.out.println("i:" + i);
            }
            System.out.println("##sedSms##结束执行..  3");

        }
    }
}
