import java.util.Scanner;

public class electricbill {


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double cu1 ;

        System.out.println("enter the id:");
        int id1 = sc.nextInt();

        System.out.println("enter the username:");
        String name2 = sc.next();

        System.out.println("enter the consumed unit:");
        double cu = sc.nextDouble();

            if(cu<199){
                double charge = cu*1.20;
                System.out.println("the charge is:" + charge);
            }
            else{
                System.out.println("the amount should be more than 100");
            }
            
            else if(cu>=200 && cu<400){
                
                double charge = cu*1.50;
                double surcharge = charge*0.15;
                double total = charge+surcharge;
                if(charge>400){
                    System.out.println("the charge is:"+charge);
                    System.out.println("the surcharge is:"+surcharge);
                    System.out.println("the total is:" + total);
                }
                else{
                    System.out.println("the charge is:"+charge);
                }
            
                

            }
            else if(cu>=400 && cu<600){

                double charge = cu*1.80;
                double surcharge = charge*0.15;
                double total = charge+surcharge;
                 
                    System.out.println("the charge is:"+charge);
                    System.out.println("the surcharge is:"+surcharge);
                    System.out.println("the total is:" + total);
                }
            
            else{
                double charge = cu*2.00;
                double surcharge = charge*0.15;
                double total = charge+surcharge;                
                System.out.println("the charge is:"+charge);
                System.out.println("the surcharge is:"+surcharge);
                System.out.println("the total is:" + total);
            }
            
        }
    }
    
    







        
    
