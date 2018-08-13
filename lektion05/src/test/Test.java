package test;

import lektion05.Bil;
import lektion05.Hjul;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		ThisTest t = new ThisTest(10);
		//		t.print();
		//		

//		Student s1 = new Student("s123456", "Anders");
//		Student s2 = new Student("s654321", "Mette");
//
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		
//		System.out.println("Universitet: " + Student.getUniversitet());
//		
//		s1.getSnr();

		
		 Bil b1;
	     Hjul vf,hf,vb,hb;
	     
	     hf = new Hjul(15, 2.1f);
	     vf = new Hjul(15, 2.1f);
	     vb = new Hjul(15, 2.2f);
	     hb = new Hjul(15, 2.2f);

	     b1 = new Bil(vf, hf, vb, hb, "Audi", "A3");
	     
	     System.out.println(b1);

		


	}

}
