package com.cg.lab9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Exercise1 {

	public static void main(String[] args) {
		Runnable task=()->{
			System.out.println("This is runnable");
		};
		Runnable task1=()->{
			System.out.println("This is fixed");
		};
		Runnable task2=()->{
			System.out.println("This is single");
		};
		
		ExecutorService cacheThreadPool=Executors.newCachedThreadPool();
		IntStream.range(0, 10).forEach(item->cacheThreadPool.execute(task));
		cacheThreadPool.shutdown();
		
		//System.out.println("----------------------------------");
		
		ExecutorService fixedThreadPool=Executors.newFixedThreadPool(2);
		IntStream.range(0, 10).forEach(item->fixedThreadPool.execute(task1));
		//System.out.println("Hello Fixed");
		fixedThreadPool.shutdown();
		
		ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
		for(int i=0;i<10;i++) {
			singleThreadPool.execute(task2);
		}
		 singleThreadPool.shutdown();
		
		

	}

}
