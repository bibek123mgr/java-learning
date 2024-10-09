enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop {

    //parameritized
    Macbook(200), Hp, Dell(20), xp(500);

    private int price;
    
    //default constructur
    private Laptop() {
        price = 500;
    }

    //parameterized constructer
    private Laptop(int price) {
        this.price = price;
    }
    

    //using getter setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
public class Enum {
    public static void main(String[] args) {

        //print only one value
        Status r = Status.Running;
        System.out.println(r);

        //print index of Status ordinal use
        System.out.println(r.ordinal());//0

        //print all the status
        Status[] status = Status.values();
        //print only one 
        System.out.println(status[0]);

        //advance for loop

        for (Status s : status) {
            System.out.print(s);
            System.out.print(" ");
        }

        System.out.println("");

        if(r == Status.Pending)
            System.out.println("i am pending");
        else if( r == Status.Running)
            System.out.println("i am running");
        else if(r == Status.Success)
            System.out.println("i am success");
        else
            System.out.println("failed");

//switch
        switch (r) {
            case Pending:
                System.out.println("i am pending");
                break;
            case Running:
                System.out.println("i am running");
                break;
            case Success:
                System.out.println("i am success");
                break;
            default:
                System.out.println("failed");
                break;
        }

        //lamda expression
        switch (r) {
            case Running -> System.out.println("i am runnig");
            case Pending -> System.out.println("i am pending");
            case Failed -> System.out.println("failed");
            case Success -> System.out.println("i am success");
            default -> System.out.println("Done");

        }

        Laptop lap = Laptop.Dell;
        //only print name
        System.out.println(lap);

        //print laptop price
        System.out.println(lap + " price is " + lap.getPrice());

        //print all laptop with price
        for (Laptop laptop : Laptop.values()) {
            System.out.print(laptop + " price is " + laptop.getPrice());
                    System.out.println(" ");
        }
    }
}
