package com.bxd.test;

public class Main {
	public static void main(String[] args) {
		Mathed m = new Mathed();
		int s1 = m.matip(12, 8);
		int s2 = m.add(21, 9);
		m.print(s1);
		m.print(s2); 
		for(int i=1;i<10;i++){
			for(int j=1;j<= i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println("");
		} 
		One o = new One(null, s2, null);
		o.methed(s1);
		o.print();
		Main.run();
	}
	public static void run(){
		System.out.println("ִ�о�̬������");
	}
}
class Mathed{
	public int matip(int i,int j){
		int s = i-j;
		return s;
	}
	public int add(int i,int j){
		int sum = i+j;
		return sum;
	}
	public void print(int i){
		System.out.println("�����Ľ��Ϊ��"+i);
	}
}
class One{
	private String name = "����";
	private int age = 20;
	private String gender = "��";
	public void print(){
		System.out.println(name+","+gender+","+age);
	}
			
	public One(String name,int age,String gender){
		this.name = "����";
		this.age = 29;
		this.gender = "Ů";
		
	}
	
	public void methed(int i){
		
		switch(i){
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("�������");
		}
		
	}
}
	