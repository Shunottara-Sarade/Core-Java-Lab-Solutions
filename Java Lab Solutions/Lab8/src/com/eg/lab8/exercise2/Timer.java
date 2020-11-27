package com.eg.lab8.exercise2;

import java.time.LocalTime;

public class Timer implements Runnable{
	
	

	public static void main(String[] args) {
		Timer t=new Timer();
		t.run();

	}

	@Override
	public void run() {
		while (true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}
		
	}

}
