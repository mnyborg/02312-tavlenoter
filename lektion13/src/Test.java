public class Test {
    public static void main(String[] args) {
        A a1 = new A(1);
        A a2 = new A(1);
        B b1 = new B(1,1);
        B b2 = new B(1,2);

        System.out.println(a1.equals(a2));
        System.out.println(b1.equals(b1));
        System.out.println(a1.equals(b1));
        System.out.println(b1.equals(a1));
    }
}
