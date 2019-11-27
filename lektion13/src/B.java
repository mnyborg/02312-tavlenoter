public class B extends A {
    private int field2;

    public B(int field1, int field2) {
        super(field1);
        this.field2 = field2;
    }

    @Override
    public boolean equals(Object other) {
        return (other != null
                && other.getClass().getName().equals(this.getClass().getName())
                && ((B)other).field2 == field2
                // superklassens equal
                && super.equals(other));
    }

}
