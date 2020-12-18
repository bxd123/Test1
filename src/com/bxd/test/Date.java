package com.bxd.test;
import java.util.Scanner;
public class Date {
	private static Scanner scanner;

	public static void main(String[] args) {
		Year y = new Year();
		System.out.println("请输入月份：");
		scanner = new Scanner(System.in);
		y.choose(scanner.nextInt());
	}
}
class Year{
	public void choose(int i){
	if(i==1||i>=11 && i<=12){
		System.out.println(i+"月份是"+"第四季度");
	}else if(i>=8 && i<=10){
		System.out.println(i+"月份是第三季度");
	}else if(i>=5 && i<=7){
		System.out.println(i+"月份是第二季度");
	}else if(i>=2 && i<=5){
		System.out.println(i+"月份是第一季度");
	}else{
		System.out.println("输入错误！");
		}
	}
}