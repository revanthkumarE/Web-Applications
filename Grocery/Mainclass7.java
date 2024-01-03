import java.util.Scanner;
class useraccount{
    String username;
    int phonenumber;
    String emailid;
    String password;
    char gender;

    useraccount(String username, int phonenumber, String password, char gender){
        this.username=username;
        this.phonenumber=phonenumber;
        this.password=password;
        this.gender=gender;
    }

    useraccount(String username, String emailid, String password, char gender){
        this.username=username;
        this.emailid=emailid;
        this.password=password;
        this.gender=gender;
    }

        void display(){
            System.out.println("username is:"+username);
            System.out.println("phonenumber is:"+phonenumber);
            System.out.println("email id is:"+emailid);
            System.out.println("password is:"+password);
            System.out.println("gender is:"+gender);
        }
    }

        class Mainclass7{
            public static void main(String[] args) {
                System.out.println("main method started");
                Scanner sc = new Scanner(System.in);


                System.out.println("select the approach that you wanna register");
                System.out.println("enter P to register via phoneno");
                System.out.println("enter E to register via email");

                String ans = sc.next();

                if(ans =='p'){
                    System.out.println("enter the username");
                    String username = sc.next();

                    System.out.println("enter the phone number");
                    int phonenumber = sc.nextInt();
                    System.out.println("enter the password");
                    String password = sc.next();
                    System.out.println("enter the gender");
                    char gender = sc.next().charAt();
                
                useraccount ua = new useraccount("rev", 7010, "revanth",'F');
                System.out.println("registering successful");
                ua.display();
                
            }
            else if(ans=='E'){
                 System.out.println("enter the username");
                    String username = sc.next();

                    System.out.println("enter the email id");
                    String emailid = sc.next();
                    System.out.println("enter the password ");
                    String password = sc.next();
                    System.out.println("enter the gender");
                    char gender = sc.next().charAt();
                
                useraccount ua2 = new useraccount("revanth", "revanthkumar", "rev",'M');
                System.out.println("registering successful");
                ua2.display();



            }
            else{
                System.out.println("INVALID ACCESS");
            }
        }
    }
        
        
    
    

    





    

