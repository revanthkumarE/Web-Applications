import java.util.Scanner;
public class GST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of items:");

        int n=scanner.nextInt();
        double[] prices = new double[n];
        for(int i=0; i<n; i++){
            System.out.println("enter the prices of items"+(i+1)+":");
            prices[i] = scanner.nextDouble();
        }

        double total = calculateTotal(prices);
        double gst = calculateGST(total);

        System.out.println("total prices:" + prices);
        System.out.println("GST:" + gst);
    }
    
    public static double calculateTotal(double[]prices){
        double total = 0;
        for(double price: prices){
            total+=price;
        }
        return total;

    }

    public static double calculateGST(double[] total){
        return total;
     

    }
}
