import java.util.Scanner;


class demo9{
    int id;
    String name;
    double salary;

    demo9(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
     }
     void updatesalary(double salary){
        System.out.println("updating salary");
        this.salary=salary;


     }
    

     }
     class Mainclass4{
        public static void main(String[] args) {
            System.out.println("main method started");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the id");
            int id1 = sc.nextInt();

            System.out.println("enter the name");
            String name1 = sc.next();

            System.out.println("enter the salary");
            double sal1 = sc.nextDouble();

            demo9 d1 = new demo9(id1, name1, sal1);
            System.out.println("the id is:"+d1.id);
            System.out.println("the name is:"+d1.name);
            System.out.println("the salary is:"+d1.salary);
            System.out.println("main method ended");

            
        }
     }
    


