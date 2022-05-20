package cn.sdfirefly.test;

import cn.sdfirefly.javase.exer02_singleton.Singleton6;

import java.util.concurrent.*;

/**
 * @author sdfirefly
 * @create 2022/5/17--14:27
 */
public class TestSingleton6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Singleton6> c = Singleton6::getInstance;

        ExecutorService es = Executors.newFixedThreadPool(2);
        /*FutureTask<Singleton6> f1 = new FutureTask<>(c);
        FutureTask<Singleton6> f2 = new FutureTask<>(c);
        es.submit(f1);
        es.submit(f2);
        System.out.println(f1.get());
        System.out.println(f2.get());*/

        Future<Singleton6> f1 = es.submit(c);
        Future<Singleton6> f2 = es.submit(c);
        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }
}
