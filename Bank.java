package Demo_kt;

public class Bank {

    private String uname;
    private String pwd;
    private double balance;

    Bank(String uname,String pwd,double balance)
    {
        this.uname=uname;
        this.pwd=pwd;
        this.balance=balance;
    }

    public double getBalance(String uname,String pwd) {
        if(uname.equals(this.uname)&&pwd.equals(this.pwd))
        {
            return balance;
        }
        return 0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
