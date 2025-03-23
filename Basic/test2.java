package Basic;
import java.util.*;

interface Animal{

}
class Dog implements Animal{

	
	
}
public class test2 {
	public void m1(List l) {
		System.out.println(l);
	}
	public void m2(Set s) {
		System.out.println(s);
	}
	public void m3(Object o) {
		System.out.println(o);
	}
	public void m4(Animal a) {
		System.out.println(a);
	}
	public Animal m5() {
		return new Dog();
	}
	public static void main(String[] args) {
		test2 t=new test2();
		t.m1(new ArrayList());
		Set s=new HashSet();
		t.m2(s);
		t.m3(s);
		t.m4(new Dog());
		//Upcasting
		
		Animal a=t.m5();  //new Dog();
		
		//Downcasting
		
		Dog d=(Dog) a;  // Dog d=(Dog) t.m5();
		
		
	
	}
	
	

}
