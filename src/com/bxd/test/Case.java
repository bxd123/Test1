package com.bxd.test;

public class Case {
	public static void main(String[] args) {
		Station s = new Station();
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				s.sale();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				s.sale();
			}
		});
		Thread t3 = new Thread(new Runnable(){
			public void run(){
				s.sale();
			}
		});
		t1.setName("黄牛1号");
		t2.setName("黄牛2号");
		t3.setName("黄牛3号");
		
		t2.start();
		t1.start();
		t3.start();
	}
}
class Station{
	public int tacket = 100;
	public void  sale(){
		Thread t = Thread.currentThread();
		while(tacket>0){
			synchronized (this) {
				if(tacket>0){
					System.out.println(t.getName()+"正在售票");
					System.out.println("还剩"+(tacket-1)+"张票!");
					tacket--;			
				}
				try {
				t.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		System.out.println("票卖完了！明儿见！");
		//return tacket;
	}
}