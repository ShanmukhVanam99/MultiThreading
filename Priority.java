package com.to.Multithreading;

  class Priority {
	 public static void main(String[] args) 
	    { 
		 Multi1 p=new Multi1();
		 System.out.println (Thread.currentThread().getPriority()); 
		 p.start();
		 System.out.println(p.getPriority());
			p.setPriority(10);
			System.out.println(Thread.currentThread().getPriority());
			System.out.println(p.getPriority());
			System.out.println("hello");
	    }

}
