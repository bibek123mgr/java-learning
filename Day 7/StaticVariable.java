class Student {
        static int year;
}
public class StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.year = 2024;
        s1.year = 2025;

        Student.year = 2020;

       System.out.println("S1\'s age is: " + s1.year);  
       System.out.println("S2\'s age is: " + s2.year);        }
}
