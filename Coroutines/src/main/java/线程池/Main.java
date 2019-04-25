package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        System.out.println("主线程开始执行");

        /*----------普通线程没有顺序，并行执行-----*/
        //用户线程  主线程执行结束 用户线程仍可以继续进行
        //创建线程池 指定线程的数量
        //线程执行完成后并没销毁 而是回到线程池中成为空闲状态
        ExecutorService service = Executors.newFixedThreadPool(3);
        Myrunnable runnable = new Myrunnable();
        service.execute(runnable);
        service.execute(runnable);

        System.out.println("主线程结束执行");
    }
}
