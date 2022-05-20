package cn.sdfirefly.test;

import cn.sdfirefly.javase.exer02_singleton.Singleton5;

import java.util.concurrent.*;

/**
 * @author sdfirefly
 * @create 2022/5/17--13:42
 */
public class TestSingleton5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

/*        Callable<Singleton5> c = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                System.out.println(Thread.currentThread().getName());
                return Singleton5.getInstance();
            }
        };*/

        //Lambda 表达式
        //Callable<Singleton5> c = () -> Singleton5.getInstance();

        //方法引用
        Callable<Singleton5> c = Singleton5::getInstance;


        ExecutorService es = Executors.newFixedThreadPool(2);
        /*FutureTask<Singleton5> f1 = new FutureTask<>(c);
        FutureTask<Singleton5> f2 = new FutureTask<>(c);

        es.submit(f1);
        es.submit(f2);

        System.out.println(f1.get());
        System.out.println(f2.get());*/

        Future<Singleton5> f1 = es.submit(c);
        Future<Singleton5> f2 = es.submit(c);

        System.out.println(f1.get());
        System.out.println(f2.get());

        es.shutdown();

    }
}
