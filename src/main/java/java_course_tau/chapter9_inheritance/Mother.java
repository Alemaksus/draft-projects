package java_course_tau.chapter9_inheritance;

public class Mother extends Woman{

    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }

    public static void testSquareOverride() {}
    public static void testInheritance() {}
    public static void testOverload() {}

}
