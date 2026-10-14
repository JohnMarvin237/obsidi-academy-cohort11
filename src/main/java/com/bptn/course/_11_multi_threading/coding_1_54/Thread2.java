package com.bptn.course._11_multi_threading.coding_1_54;

public class Thread2 extends Thread {
    
    SynchronizedPrinter obj;
    
    // Create a constructor to initialize the above instance variable
    public Thread2(SynchronizedPrinter obj){
      this.obj = obj;
    }
    
    // Override the run() method here to call printNumbers()
    @Override
    public void run(){
      obj.printNumbers();
    }
    
}