import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double combu = sc.nextDouble();
        
        double resultado = km / combu;
        
        System.out.printf("%.3f km/l%n", resultado);
       
    }
 
}
