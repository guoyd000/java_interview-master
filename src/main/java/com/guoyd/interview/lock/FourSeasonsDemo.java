package com.guoyd.interview.lock;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class FourSeasonsDemo {

    private static final HashMap hashMap = new HashMap();

    public static void main(String[] args) throws InterruptedException {
        hashMap.put("1",2);
        System.out.println(hashMap.get("1"));
        CountDownLatch count = new CountDownLatch(4);
        for (int i = 1; i < 5; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"\t 季节");
                count.countDown();
            },FourSeasonsEnum.foreach_Season("0"+i).getSeason()).start();
        }
        count.await();
        System.out.println(Thread.currentThread().getName()+ "\t 过年!");
    }
}
