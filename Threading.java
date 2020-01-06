package com.to.Multithreading;

public class Threading extends Thread{
	
	    public void run() 
	    { 
	        System.out.println("Run method executed by child Thread"); 
	    } 
	    public static void main(String[] args) 
	    { 
	        Threading t = new Threading(); 
	        t.start(); 
	        System.out.println("Main method executed by main thread"); 
	    } 
	
}
