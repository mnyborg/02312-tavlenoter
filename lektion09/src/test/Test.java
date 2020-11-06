package test;

import facebook.MessagePost;
import facebook.PhotoPost;
import personer.Student;


public class Test  {

    public static void main(String[] args) {

//        Student st1 = new Student("Hans", "Pilevej 6","s123456" );
//        System.out.println(st1);
//        System.out.println("Navn: " + st1.getNavn());
//
//    //    st1.Hello();
//
//        Student st2 = new Student("Hans","s123456" );
//        System.out.println(st2);



       //   Post p = new Post("Mads");
        MessagePost mp1 = new MessagePost("Mads", "message1");
        PhotoPost mp2 = new PhotoPost("Mads"    , "photo1.jpeg", "Photo1");
        mp1.like();
        mp1.addComment("comment1");
        mp1.addComment("comment2");
        mp1.addComment("comment3");
        System.out.println(mp1);
        System.out.println(mp2);

//        Cylinder c = new Cylinder(3.0,4.0);
//        System.out.println(c);
//        System.out.println(c.areal());
	}
}
