package com.heima.thread;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		//demo1();
		new Thread() {
			public void run () {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(getName()+"...aaaa");
				}
			}
		}.start();
		
		new Thread() {
			public void run () {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(getName()+"...b");
				}
			}
		}.start();
	}

	private static void demo1() throws InterruptedException {
		for (int i = 20; i >= 0; i--) {
			Thread.sleep(1000);
			System.out.println(i);
		}
	}

}
