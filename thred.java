class ThreadClass extends Thread{
    int value ;
    ThreadClass(int value){
    this.value= value ;
    }
    public void run(){
        System.out.println(value);
    }
}

public class thred {
    public static void main(String[] args) {
       ThreadClass T1 = new ThreadClass(8);
       System.out.println("thread is on or of "+ T1.isAlive());
       T1.start();
       System.out.print("Thread is on of "+T1.isAlive());
       try{
        T1.join();
       }
       catch(InterruptedException e){
        System.out.print(e.getMessage)
       }
    }
    
}

