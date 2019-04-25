package 线程join;

public class Main {
    public static void main(String[] args){
        System.out.println("主线程开始执行");
        /*----------普通线程没有顺序，并行执行-----*/
        Mythread thread = new Mythread();
        thread.setName("线程1");
        thread.start();
        try {
            thread.join();                    //后面的线程必须等待当前线程执行结束，将并行线程转为串行线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束执行");
    }
}
