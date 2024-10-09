
class Circle {
    void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swap value is a = " + a + " and b = " + b);

  }
}
class BasicExe {
    public static void main(String[] arga) {
        Circle cal = new Circle();
        int a = 5;
        int b = 6;
        System.out.println("before Swap value is a = " + a + " and b = " + b);
        cal.swap(a, b);
   }
}