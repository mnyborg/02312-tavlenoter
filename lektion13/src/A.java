public class A {
    private int field1;

    public A(int field1) {
        this.field1 = field1;
    }

    // 1. betingelse tester at other ikke er null
    // 2. betingelse tester at other er en instans af A
    // 3. betingelse tester at other.field == this.field

    @Override
    public boolean equals(Object other) {
        return (other != null
                && (other.getClass().getName().equals(this.getClass().getName()))
                && ((A) other).field1 == field1);
    }
}
