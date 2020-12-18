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
		System.out.println("执行静态方法！");
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
		System.out.println("运算后的结果为："+i);
	}
}
class One{
	private String name = "张三";
	private int age = 20;
	private String gender = "男";
	public void print(){
		System.out.println(name+","+gender+","+age);
	}
			
	public One(String name,int age,String gender){
		this.name = "王五";
		this.age = 29;
		this.gender = "女";
		
	}
	
	public void methed(int i){
		
		switch(i){
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
		default:
			System.out.println("输入错误！");
		}
		
	}
}
	