package 线程的创建;

class Mythread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(getName() +"打印了"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
