package Basic;

import java.util.Scanner;

public class Demo {
	// create method in non-primitive datatype 
	public Object m1() {
		return new Object();
	}
	public static Demo m2() {
		return new Demo();
	}
	public String m3() {
		return new String();
	}
	public Scanner m4() {
		return new Scanner(System.in);
		
	}

	public static void main(String[] args) {
		
		Demo d=m2();
		d.m1();
		d.m3();
		d.m4();
		

	}

}
