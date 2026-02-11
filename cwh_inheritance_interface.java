/*interface Sampleinterface {
    void meth1();

    void meth2();
}

interface ChildSampleinterface extends Sampleinterface {
    void meth3();

    void meth4();

}

class mySampleclass implements ChildSampleinterface {
    public void meth1() {
        System.out.println("this is method 1");

    }

    public void meth2() {
        System.out.println("this is method 2");

    }

    public void meth3() {
        System.out.println("this is method 3");
    }

    public void meth4() {
        System.out.println("this is method 4");
    }
}

public class cwh_inheritance_interface {
    public static void main(String[] args) {
        mySampleclass obj = new mySampleclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();

    }
} */

/*interface ritiksirsoftwaredeveloper {
    public void coding();

    public void Salary();

    public void greet();
}

interface gautamjuniorsoftwaredeveloper extends ritiksirsoftwaredeveloper {
    public void testing();

    public void deploy();
}

class gautamdeveloper implements gautamjuniorsoftwaredeveloper {
    public void coding() {
        System.out.println("ritik is coding");

    }

    public void Salary() {
        System.out.println("ritik gets 1 lakh salary");
    }

    public void greet() {
        System.out.println("ritik says good morning");

    }

    public void testing() {
        System.out.println("gautam is testing the code");
    }

    public void deploy() {
        System.out.println("gautam is deploying the code");
    }
}

public class cwh_inheritance_interface {

    public static void main(String[] args) {
        gautamdeveloper obj = new gautamdeveloper();
        obj.coding();
        obj.Salary();
        obj.greet();
        obj.testing();
        obj.deploy();
    }
} */

/*interface onlinepayment {
    public void payonline();

    public void getcashback();

    public void showbalance();
}

interface cashpayment extends onlinepayment {
    public void handthrow();

    public void realcashthrow();
}

class paymentApp implements onlinepayment, cashpayment {
    public void payonline() {
        System.out.println("gautam pay online payment");
    }

    public void getcashback() {
        System.out.println("gautam cashback");
    }

    public void showbalance() {
        System.out.println("balance showing");

    }

    public void handthrow() {
        System.out.println(" gautam give payment handthrow");
    }

    public void realcashthrow() {
        System.out.println("the real cash money");
    }
}

public class cwh_inheritance_interface {

    public static void main(String[] args) {
        paymentApp pay = new paymentApp();
        pay.payonline();
        pay.getcashback();
        pay.showbalance();
        pay.handthrow();
        pay.realcashthrow();
    }
} */

interface Account {
    void openAccount();

    void applyloan();
}

interface loan extends Account {
    void gkopenAccount2();

    void gkapplyloan2();
}

class Bankcustomer implements Account, loan {
    public void openAccount() {
        System.out.println("account open Successfully");
    }

    public void applyloan() {
        System.out.println("loan apply succesfully");

    }

    public void gkapplyloan2() {
        System.out.println("account 2 open succesfully");

    }

    public void gkopenAccount2() {
        System.out.println("account 2 open succesfully ");
    }
}

public class cwh_inheritance_interface {

    public static void main(String[] args) {
        Bankcustomer gautam = new Bankcustomer();
        gautam.applyloan();
        gautam.gkapplyloan2();
        gautam.openAccount();
        gautam.gkapplyloan2();
    }
}