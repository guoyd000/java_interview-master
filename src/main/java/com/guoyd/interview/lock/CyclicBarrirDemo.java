package com.guoyd.interview.lock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrirDemo {
    public static void main(String[] args) {
//        CyclicBarrier cyclicBarrier = new CyclicBarrier();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
            System.out.println("嘻嘻嘻嘻嘻嘻");
        });
        for (int i = 0; i < 7; i++) {
            final int temInt = i;
           new Thread(() -> {
               System.out.println(Thread.currentThread().getName()+"\t xxxx"+temInt+"!");
               try {
                   cyclicBarrier.await();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               } catch (BrokenBarrierException e) {
                   e.printStackTrace();
               }
           },String.valueOf(i)).start();
        }
    }
}
