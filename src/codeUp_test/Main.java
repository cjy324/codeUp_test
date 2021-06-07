package codeUp_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("기본 숫자형 타입의 최대/최소값");
		
		System.out.println("--- 정수 타입 ---");
		System.out.println("byte(1바이트)");
		System.out.println("최대값: " + Byte.MAX_VALUE);
		System.out.println("최소값: " + Byte.MIN_VALUE);
		System.out.println("short(2바이트)");
		System.out.println("최대값: " + Short.MAX_VALUE);
		System.out.println("최소값: " + Short.MIN_VALUE);
		System.out.println("int(4바이트)");
		System.out.println("최대값: " + Integer.MAX_VALUE);
		System.out.println("최소값: " + Integer.MIN_VALUE);
		System.out.println("long(8바이트)");
		System.out.println("최대값: " + Long.MAX_VALUE);
		System.out.println("최소값: " + Long.MIN_VALUE);
		
		System.out.println("--- 실수 타입 ---");
		System.out.println("float(4바이트)");
		System.out.println("최대값: " + Float.MAX_VALUE);
		System.out.println("최소값: " + Float.MIN_VALUE);
		System.out.println("double(8바이트)");
		System.out.println("최대값: " + Double.MAX_VALUE);
		System.out.println("최소값: " + Double.MIN_VALUE);
		sc.close();
	}
}
