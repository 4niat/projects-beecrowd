import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int second = sc.nextInt();
        
        int horas = second / 3600;
        second = second % 3600;
        int minutos = second / 60;
        second = second % 60;
        
        System.out.println(horas + ":"+ minutos + ":"+ second);
 
    }
 
}
