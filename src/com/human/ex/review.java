package com.human.ex;
public class review {
	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 3;
		System.out.println("몫 : "+(a1/a2)+"  나머지 : "+(a1%a2));
		
		int b1=3;
		System.out.println((int) Math.pow(b1, 3));
		
		int x=1, y=2, z=3;
		System.out.println(x*y-z);
		
		int n=555;
		System.out.print(n/100 + "백 ");
		System.out.print(n%100/10 + "십 ");
		System.out.println(n%10);
		
		int aa=10;
		System.out.println((float) (Math.pow(aa, 3)-20)/(aa-7));
		
		int x01=0, y01=0, x02=3, y02=4;
		
		System.out.println((float) Math.sqrt(Math.pow(x01-x02, 2)+Math.pow(y01-y02, 2)));
		
		
		
	}

}
