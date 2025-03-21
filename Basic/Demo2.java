package Basic;

public class Demo2 {
	
	void m1(Object o)  
	{
		System.out.println(o);
		
	}
	void m2(String s) {
		System.out.println(s);
	}
	void m3(Demo2 d) {
		System.out.println(d);
	}

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.m1(new Object());
		d.m2(new String("Hello"));
		d.m3(new Demo2());
		

	}

}
