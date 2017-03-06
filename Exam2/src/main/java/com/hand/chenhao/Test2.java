package com.had.test;

import java.util.Scanner;

public class Test2 {
	public static double getSal(){
		System.out.print("请输入工资:");
		Scanner sc=new Scanner(System.in);
		double sal=sc.nextDouble();
		double pike=0;
		if(sal>=0&&sal<=1500){
			pike = sal*3/100;
		}else if(sal<=4500){
			pike=(sal-1500)*10/100;
		}else if(sal<=9000){
			pike=(sal-4500)*20/100;
		}else if(sal<=35000){
			pike=(sal-9000)*25/100;
		}else if(sal<=55000){
			pike=(sal-35000)*30/100;
		}else if(sal<=80000){
			pike=(sal-55000)*35/100;
		}else{
			pike=(sal-80000)*45/100;
		}
		System.out.print("所需要缴纳的税费为:"+pike);
		return pike;
	}
	public static void main(String[] args) {
		getSal();
	}
}
