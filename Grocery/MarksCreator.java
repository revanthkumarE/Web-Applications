import java.util.Scanner;
public class MarksCreator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks obtained");

        int marks = scanner.nextInt();

        if(marks>=80){
            System.out.println("Excellent");

        }
        else if(marks>=70){
            System.out.println("very good");

        }
        else if(marks>=60){
            System.out.println("good");
        }
        else{
            System.out.println("Bad");
        }


        
            }
        }
    
            


        

