class Account {
    int acc_no;
    String name;
    float amount;

    void insert(int a, String n, float amnt) {
        acc_no = a;
        name = n;
        amount = amnt;
    }

    void deposite(float amnt) {
        amount += amnt;
        System.out.println(amnt + "deposited");
    }

    void withdraw(float amnt) {
        if (amount > amnt) {
            amount -= amnt;
            System.out.println("cast Withdraw");
        } else {
            System.out.println("insuffient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance is " + amount);
    }

    void display() {
        System.out.println( acc_no + " " + name + " " + amount);
    }
    }

public class TestAccount {
   public static void main(String[] args) {
       Account a1 = new Account();
       a1.insert(1232290, "bibek kumar bakabal", 12367.03f);
       a1.display();
       a1.checkBalance();
       a1.deposite(20001.03f);
       a1.withdraw(20091.03f);
       a1.checkBalance();
   } 
}
