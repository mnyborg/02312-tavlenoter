/**
 * class A handler om ....
 * @author Mads Nyborg
 */
public class A {
    private int field1;

    /**
     * Konstruktør
     * @param field1 field1 er ...
     */
    public A(int field1) {
        this.field1 = field1;
    }

    // 1. betingelse tester at other ikke er null
    // 2. betingelse tester at other er en instans af A
    // 3. betingelse tester at other.field == this.field

    /**
     * Implementering af equals
     * @param other objekt de skal sammenlignes med
     * @return true hvis ens, ellers false
     */
    @Override
    public boolean equals(Object other) {
        return (other != null
                && (other.getClass().getName().equals(this.getClass().getName()))
                && ((A) other).field1 == field1);
    }
}
