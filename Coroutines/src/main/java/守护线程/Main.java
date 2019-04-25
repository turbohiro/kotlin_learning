package 守护线程;

public class Main {
    public static void main(String[] args){
        System.out.println("主线程开始执行");

        /*----------普通线程没有顺序，并行执行-----*/
        //用户线程  主线程执行结束 用户线程仍可以继续进行
        //守护线程是指在程序运行的时候在后台提供一种通用的服务的线程(垃圾回收线程)。  主线程执行结束后，垃圾回收线程就会结束
        Mythread thread = new Mythread();
        thread.setName("线程1");
        //设置为守护线程  必须在启动前调用
        //主线程执行结束后  守护线程就停止了
        thread.setDaemon(true);
        thread.start();

        System.out.println("主线程结束执行");
    }
}
