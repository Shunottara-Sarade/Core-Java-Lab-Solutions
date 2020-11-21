package com.capg.lab4.exercise3.client;

import com.capg.lab4.exercise3.service.Item;
import com.capg.lab4.exercise3.service.Video;

public class Main {

	public static void main(String[] args) {
		
		Item video = new Video(1,"Movie",1,3);
		System.out.println(video);
		Item video1 = new Video();
		
	}

}
