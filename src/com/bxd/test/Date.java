package com.bxd.test;
import java.util.Scanner;
public class Date {
	private static Scanner scanner;

	public static void main(String[] args) {
		Year y = new Year();
		System.out.println("�������·ݣ�");
		scanner = new Scanner(System.in);
		y.choose(scanner.nextInt());
	}
}
class Year{
	public void choose(int i){
	if(i==1||i>=11 && i<=12){
		System.out.println(i+"�·���"+"���ļ���");
	}else if(i>=8 && i<=10){
		System.out.println(i+"�·��ǵ�������");
	}else if(i>=5 && i<=7){
		System.out.println(i+"�·��ǵڶ�����");
	}else if(i>=2 && i<=5){
		System.out.println(i+"�·��ǵ�һ����");
	}else{
		System.out.println("�������");
		}
	}
}