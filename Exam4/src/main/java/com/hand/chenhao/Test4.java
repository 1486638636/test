package com.had.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 随机生成50个小于100的整数,放入List中,将List中的数据除以
10, 以 结 果 的 整 数 值 作 为 key 放入 Map 中 , 得到如
{1=>[11,10,12],2=>[21,24,23]}的Map,再将Map中key对应的数组进
行排序,得到如{1=>[10,11,12],2=>[21,23,24]} 
输出的形式如下: 
随机生成 50个小于100的数,分别为: xxx,xxxx,xxxx 
Map中的数据为: {1=>[11,10,12],2=>[21,24,23]} 
排序后的 Map为: {1=>[10,11,12],2=>[21,23,24]} 
 
 * @author CH
 *
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.print("随机生成50个小于100的整数，分别为：");
		Random r=new Random();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int arr[];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int num=0;
		int key=0;
		for(int i=0;i<50;i++){
		   num=r.nextInt(100);
		   list.add(num);
		   System.out.print(num+",");
		}
		System.out.println();
		System.out.print("Map中的数据为:{");
		for(Integer i:list){		
			key=i/10;
			map.put(key, i);
			
			System.out.print(key+"=>"+map.get(key)+",");
			
		}
		System.out.println("}");
			
	}	
		
}
