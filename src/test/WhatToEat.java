package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WhatToEat {

	public static void main(String[] args) {
		// ÿ���ʲô
List<String> list =new ArrayList<String>();
list.add("���˼��׷�");
list.add("�з�");
list.add("����");
list.add("�������/������");
list.add("����");
list.add("����");
list.add("����Ͱ��/��Ƥ����");
list.add("����/ը��");
list.add("��");
int n=10;
while(n-->0){
System.out.println(list.get((new Random()).nextInt(9)));}
	}

}
