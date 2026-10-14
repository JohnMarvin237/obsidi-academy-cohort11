package com.bptn.course._11_multi_threading.coding_1_52;

import java.util.List;

public class MyThread extends Thread {

    // Declare an instance variable of type List<Integer>
    List<Integer> list ;
    // Create a parameterized constructor.
    public MyThread(List<Integer> list, String name){
      super();
      this.setName(name);
      this.list = list;
    }

    // Override the run() method here.
    @Override
      public void run(){
        ListUtils.insertNextId(list);
      }   
}