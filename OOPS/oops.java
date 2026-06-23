package OOPS;

public class oops {

    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("pink");
        p1.setTip(3);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.color="black";// like this also we can change
        System.out.println(p1.color);

        // BankAcc user1=new BankAcc();
        // user1.userName="Sam";
        // // user1.password=1234;// cannot access like this
        // user1.setPass(3482);

        // BankAcc user1=new BankAcc();
        // user1.getAccNo(3482);
        // user1.resetPwd(3482, 3393);
        // user1.getAccNo(3482);

    }
}

// class BankAcc{
//     public String username;
//     private int pwd=3482;
//     private long accNo=6670001500005947L;
//     public void resetPwd(int oldPwd,int newPwd){
//         //setters
//         if(oldPwd==pwd){
//             pwd=newPwd;
//             System.out.println("password reset completed..");
//         }else{
//             System.out.println("incorrect pin acc blocked..");
//     }

//     }
//     public void getAccNo(int pass){
//         if(pass==pwd){
//             System.out.println(this.accNo);
//         }else{
//             System.out.println("no user exists..");
//         }
//     }

// }
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}