package personer;

public class Student extends Person {
    private String studieNummer;

    public Student(String navn, String adresse, String studieNummer) {
        // super skal altid være første statement
        super(navn, adresse);
        this.studieNummer = studieNummer;
    }

    public Student(String navn, String studieNummer) {
        // super skal altid være første statement
        super(navn);
        this.studieNummer = studieNummer;
    }


    @Override
    public void Hello() {
        // super.Hello();
        System.out.println("Student Hello" + "\n");
        System.out.println("navn: " + navn);

    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "{" +
                "studieNummer='" + studieNummer + '\'' +
                '}';
    }
}
//Student st1 = new Student("Hans", "Pilevej 6","s123456" );
//
//public class SpecialStudent extends Student {
//    private String exstraInfo;
//
//    public SpecialStudent(String navn, String adresse, String studieNummer, String exstraInfo) {
//        // super.super(navn, adresse); // ikke lovlig - kun et trin op
//        super(navn, adresse, studieNummer);
//        this.exstraInfo = exstraInfo;
//    }
//}