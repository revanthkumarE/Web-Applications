import java.util.Scanner;
public class salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the salary:");
        int n = next.nextInt();
        

        int[][] salary = new int[n][5];
        for(int i=0; i<n; i++){
            System.out.println("enter the marks for students" + (i+1)+":");
            for(int j=0; j<5;j++){
                System.out.println("salary" + (j+1)+":");

                salary[i][j] = scanner.nextInt();
            }
        }

        displaysalary(salary);
    }
    public static void displaysalary(int[][] marks){
        System.out.println("salary for all employee:");

        for(int i=0; salary.length; i++){
            System.out.println("employee" + (i+1)+":");
            for(int j=0; j<salary[i].length; j++){
                System.out.println(marks[i][j]+"");
            }
            System.out.println();

        }
    }
    
}

