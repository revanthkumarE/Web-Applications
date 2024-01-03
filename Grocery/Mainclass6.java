class bankaccount{
    int accno;
    String hname;
    double balance;

    bankaccount(int accno, String hname, double balance){
        this.accno = accno;
        this.hname = hname;
        this.balance = balance;
    }
    void viewbalance(){
        System.out.println("viewing balance"+balance);

    }
    void depositing(int n1){
        System.out.println("depositing:");
        if(n1<balance){
            balance = balance-n1;
            System.out.println("deposit success");
        }
        else{
            System.out.println("deposit unsuccessful:");
        }
    void withdrawal(double n2){
        System.out.println("withdrawing:");
        balance = balance+n2;


        




        }

    }

}





class Mainclass6 {
    
}
