package com.pcl.learn.thread;

import sun.nio.ch.ThreadPool;

/**
 * 模板方法设计模式
 */
public class TmplateMethod {
    public void start(){
        System.out.println("线程启动。。。");
        run();
        System.out.println("线程已经启动了。。。");
    }
    public void run(){

    }

    public static void main(String[] args) {
        ThreadGroup threadPool = new ThreadGroup("name");
        Thread t = new Thread(threadPool,"t");
        TmplateMethod tmplateMethod = new TmplateMethod(){
            @Override
            public void run(){
                System.out.println("执行run方法。。。");

            }
        };
        tmplateMethod.start();
    }
}





