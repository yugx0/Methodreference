package com;

interface Sayable7 {

	 void say();
}
public class ConstrucorBasedDemo {
	ConstrucorBasedDemo() {
		
		System.out.println("from constructor");
    }
		public static void main(String ag[]) {
			Sayable7 h = ConstrucorBasedDemo::new;
				h.say();
 }
}