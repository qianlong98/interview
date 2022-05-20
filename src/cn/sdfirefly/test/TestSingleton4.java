package cn.sdfirefly.test;

import cn.sdfirefly.javase.exer02_singleton.Singleton4;

import java.util.concurrent.*;

/**
 * @author sdfirefly
 * @create 2022/5/17--13:32
 */
public class TestSingleton4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();
        System.out.println(s1);
        System.out.println(s2);*/

        /*Callable<Singleton4> c = new Callable<Singleton4>() {
                @Override
            public Singleton4 call() throws Exception {
                System.out.println(Thread.currentThread().getName());
                return Singleton4.getInstance();
            }
        };*/

        //Lambda表达式
        //Callable<Singleton4> c = () -> Singleton4.getInstance();


        Callable<Singleton4> c = () -> {
            System.out.println(Thread.currentThread().getName());
            return Singleton4.getInstance();
        };

        //方法引用
        //Callable<Singleton4> c = Singleton4::getInstance;



        ExecutorService es = Executors.newFixedThreadPool(2);
        /*FutureTask<Singleton4> f1 = new FutureTask<>(c);
        FutureTask<Singleton4> f2 = new FutureTask<>(c);
        es.submit(f1);
        es.submit(f2);
        System.out.println(f1.get());
        System.out.println(f2.get());*/

        Future<Singleton4> f1 = es.submit(c);
        Future<Singleton4> f2 = es.submit(c);

        System.out.println(f1.get());
        System.out.println(f2.get());



        es.shutdown();
    }
}
