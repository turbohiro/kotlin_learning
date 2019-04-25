package 线程的创建;

class TicketThread extends Thread {
    private int tickets = 10;
    @Override
    public void run(){
        while(true){
                if(tickets<0){
                    System.out.println(getName()+"卖出第"+tickets+"张票");
                    tickets--;
                }
            System.out.println("票都卖完了");
        }
    }
}

