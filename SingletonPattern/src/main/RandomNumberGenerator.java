package main;

import java.util.Random;

public class RandomNumberGenerator {
	
	private volatile static RandomNumberGenerator randomNumberGenerator;
	
	
	public static RandomNumberGenerator getInstance(){
		if(randomNumberGenerator == null){
			synchronized (randomNumberGenerator) {
				if(randomNumberGenerator == null){
					randomNumberGenerator = new RandomNumberGenerator();
				}
			}
		}
		return randomNumberGenerator;
	}
	
	public int getRandomChar(){
		Random random = new Random();
	}

}
