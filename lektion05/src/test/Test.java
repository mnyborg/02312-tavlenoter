package test;

import lektion05.Bil;
import lektion05.Dice;
import lektion05.Hjul;
import lektion05.Student;

public class Test {
	private int a;

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dice d1 = new Dice(2); // faceVal = 3
//		Dice d2 = new Dice(6); // faceVal = 6
//
//		d1.setFaceVal(1);  // setFaceVal(this (d1), 3)
//		d2.setFaceVal(1);  // setFaceVal(this (d2), 1)
//
//		System.out.println(d1);
//		System.out.println(d2);
//
//		if (d1 == d2)
//			System.out.println("d1 og d2 viser de samme øjne");
//
//		if (d1.equals(d2))
//			System.out.println("d1 og d2 viser de samme øjne");
//

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
//		Student.setUniversitet("CBS");
//
//		System.out.println(s1);
//		System.out.println(s2);
//
//
//		System.out.println("Universitet: " + Student.getUniversitet());
//
//
//		s1.getSnr();

		
		 Bil b1;
	     Hjul vf,hf,vb,hb;

	     hf = new Hjul(15, 2.1f);
	     vf = new Hjul(15, 2.1f);
	     vb = new Hjul(15, 2.2f);
	     hb = new Hjul(15, 2.2f);

	     b1 = new Bil("Audi", "A3", vf, hf, vb, hb);

	     System.out.println(b1);

//


		setA(3);

	}

}
