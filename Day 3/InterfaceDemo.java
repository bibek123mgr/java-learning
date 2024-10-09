

@FunctionalInterface
interface A {
    void show(int a,int b);
}

class B implements A {

    @Override
    public void show(int a,int b) {
        System.out.println("i am from show");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {

        //ananymous class
        A obj = new A() {
            @Override
            public void show(int a,int b) {
                System.out.println("i am learnig interface and ananymous class");
            }
           
        };
        obj.show(4,5);

        A newObj = new B();
        newObj.show(4,5);


        //lambda Expression 
        //this make file size bigger but not create .class file
        A obj1=(int i,int k)->System.out.println("i am learnig interface and ananymous class and i am from lamda Expression"+ i);
        obj1.show(4,5);

        //parameterized
    }
}
