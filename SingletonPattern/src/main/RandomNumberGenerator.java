package main;

import java.util.Random;

public class RandomNumberGenerator {
	
	private volatile static RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
	
	
	public static RandomNumberGenerator getInstance(){
//		if(randomNumberGenerator == null){
//			synchronized (randomNumberGenerator) {
//				if(randomNumberGenerator == null){
//					randomNumberGenerator = new RandomNumberGenerator();
//				}
//			}
//		}
		return randomNumberGenerator;
	}
	
	public int getRandomChar(){
		int max = 122;
		int min = 48;
		Random random = new Random();
		return random.nextInt((max-min)+1)+min;
	}

}
