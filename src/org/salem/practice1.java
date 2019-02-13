package org.salem;

public class practice1 {
	
	static Integer calc(int p, int m, int d) {
		
		for (int i = 0; i < 100; i++) {
			if (d <= p * Math.pow(1+i/100.0,m)) {
				return i;
			}
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		System.out.println("당신의 정답은???");
		System.out.println(calc(10000000,9,13000000));
		System.out.println(calc(1000000,3,1000000));
	}
	
}
