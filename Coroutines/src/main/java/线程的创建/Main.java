package 线程的创建;

public class Main {
    public static void main(String[] args){
        System.out.println("主线程开始执行");
        /*----------通过Thread形式创建-----*/
        //线程的创建.Mythread thread = new 线程的创建.Mythread();
        //thread.setName("线程1");
        //thread.start();
        //System.out.println("主线程结束执行");

        //*----------通过Runnable形式创建-----*/
//        线程的创建.Myrunnable runnable = new 线程的创建.Myrunnable();
//        Thread thread = new Thread(runnable);
//        thread.setName("线程1");
//        thread.start();

        /*直接通过Thread卖票---
        * 如果线程之间需要共享数据，则需要runnable
        * */

 /*       线程的创建.TicketThread thread1 = new 线程的创建.TicketThread();
        //窗口一
        线程的创建.TicketThread thread2 = new 线程的创建.TicketThread();
        //窗口二
        线程的创建.TicketThread thread3 = new 线程的创建.TicketThread();
        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");
        thread1.start();
        thread2.start();
        thread3.start();*/

       /*-----通过runnable实现票的分发,总共只有10张票，三个窗口进行分发*/
        TicketRunnable runnable = new TicketRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");
        thread1.start();
        thread2.start();
        thread3.start();



    }
}
