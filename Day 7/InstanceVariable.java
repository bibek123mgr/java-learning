public class InstanceVariable {
    public String name;
    public int age = 19;

    public InstanceVariable() {
        this.name = "bibek";
    }

    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
        System.out.println("Student name is " + obj.name);
        System.out.println("Age is "+ obj.age);
    }
}
