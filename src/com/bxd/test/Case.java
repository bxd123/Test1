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
		t1.setName("��ţ1��");
		t2.setName("��ţ2��");
		t3.setName("��ţ3��");
		
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
					System.out.println(t.getName()+"������Ʊ");
					System.out.println("��ʣ"+(tacket-1)+"��Ʊ!");
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
		System.out.println("Ʊ�����ˣ���������");
		//return tacket;
	}
}