package Multithreadingclass;

public class threadtester {
    public static void main(String[] args) {
    System.out.println("Main is Starting");
       /*    Thread thread1=new Thread1("thread1");
       // thread1.setDaemon(true);
        thread1.start();
        Thread thread2=new Thread(new Thread2(),"thread2");
        thread2.start();

        
        new Thread().run(); */
      /*  Stack stack=new Stack(5);
        
         new Thread(() -> {
            int counter=0;
            while (++counter<10) 
                System.out.println("Pushed:" +stack.push(100));      
        }, "Pusher").start();
        
        new Thread(()->{
            int counter=0;
            while (++counter<10) 
                System.out.println("Popped:" +stack.pop());              
        }, "Popper").start();*/
     /*    Thread thread3=new Thread(() -> {
                try{
                    Thread.sleep(1);
                    for(int i=10000;i>0;i--);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
        }, "States");
        while (true) {
            Thread.State state=thread3.getState();
            System.out.println(state);
            if(state==Thread.State.TERMINATED)break;
            
        }
            //System.out.println("Main is exiting");
        */
    String lock1="Samyam";
    String lock2="EightyOne";
    //Creating a dead lock in java
        Thread thread1=new Thread(()->{
            synchronized(lock1){
                try{
                Thread.sleep(1);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
                synchronized(lock2){
                    System.out.println("lock acquired");
                }
            }
        },"thread1");
        Thread thread2=new Thread(()->{
            synchronized(lock2){
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                synchronized(lock1){
                    System.out.println("lock Acquired");
                }
            }
        },"thread2");
        thread1.start();
        thread2.start();
    
    }
} 
