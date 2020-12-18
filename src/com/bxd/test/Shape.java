package com.bxd.test;
import java.util.Scanner;
public abstract class Shape {
	public static final double PI = 3.14;
	public double length1;
	public double length2;
	public double width;
	public double height;
	public double beveling1;
	public double beveling2;
	public double r;
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scann = new Scanner(System.in);
		System.out.println("请输入要计算球的半径：");
		Ball b = new Ball();
		Thread t1 = new Thread(){
			public void run(){
				System.out.println("球的周长为："+b.perimeter(scann.nextDouble()));
				System.out.println("球的面积为："+	b.volume(scann.nextDouble()));
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				Trap t = new Trap();
				System.out.println("请输入梯形的上底，下底，高,左腰，右腰");
				Double a[] = new Double[5];
				for(int i=0;i<a.length;i++){
					double a1 = scann.nextDouble();
					a[i] = a1;
				}	
				t.primeter(a[0], a[1], a[2],a[3],a[4]);
				t.volume(a[0], a[1], a[2]);
			}
		};
		t1.start();
		t1.join();
		t2.start();	
	}
}
class Ball extends Shape{
	public double perimeter(double r){
		try {
			this.r = r;
			
		} catch (Exception e) {
		}
			return (4.0/3)*PI*r*r;
	}
	public double volume(double r){
		try {
			this.r = r;
		} catch (Exception e) {
		}
		return (4.0/3)*PI*r*r*r;
	}
}
class Trap extends Shape{
	public void primeter(double l1,double l2,double h,double b1,double b2){
		this.height= h;
		this.length1 = l1;
		this.length2 = l2;
		this.beveling1 = b1;
		this.beveling2 = b2;
		System.out.println(h+l1+l2+b1+b2);
	}
	public void volume(double l1,double l2,double h){
		this.length1 = l1;
		this.length2 = l2;
		this.height = h;
		
		System.out.println((l1+l2)*h/2);
	}
}