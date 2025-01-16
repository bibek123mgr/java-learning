public class SunnyNumberExample1 {

    static boolean isSunny(int n) {
        double a = Math.sqrt(n + 1);
        return (a - Math.floor(a) == 0);
    }

    static boolean isSunny2(int n) {
        return Math.sqrt(n + 1) % 1 == 0;
    }
    
    void display(int n) {
        if(isSunny2(n))
            System.out.println("Sunny Number");
        else
        System.out.println("Not Sunny Number");
    }
    public static void main(String[] args) {
        SunnyNumberExample1 sn = new SunnyNumberExample1();
        sn.display(80);
    }
}
