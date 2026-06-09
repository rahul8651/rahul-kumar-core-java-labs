package com.ibm.core.java.Day4.MultiThreading;

public class MultiThreadingDemo extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
		
	}
	
	
	
	

}
