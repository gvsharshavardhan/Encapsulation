package Demo_kt;

public class BankDemo {

    public static void main(String[] args) {
        Bank b=new Bank("harsha","password",10000);
        System.out.println(b.getBalance("harsha","password"));
    }
}
