package 线程的创建;

/*
    线程安全问题出现的原因：
    是否出现多线程
    是否有共享数据
    是都有多条语句操作共享数据
    解决：同步关键字

 */
class TicketRunnable implements Runnable {
    private int tickets = 40;
    @Override
    public void run() {
        while(true){
            //加上同步操作,让多个线程不能操作同一个函数块
            synchronized (TicketRunnable.class){
                if(tickets>0){
                    System.out.println(Thread.currentThread().getName()+"卖出第"+tickets+"张票");
                    tickets--;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}
