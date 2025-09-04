import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int horaIni = sc.nextInt();
        int minuIni = sc.nextInt();
        int horaFim = sc.nextInt();
        int minuFim = sc.nextInt();
        
        int inicioIni = horaIni * 60 + minuIni;
        int fimTotal = horaFim * 60 + minuFim;
        
        int duracaoMinutos;
        if(fimTotal > inicioIni) {
            duracaoMinutos = fimTotal - inicioIni;
            }else {
            duracaoMinutos = (24 * 60 - inicioIni) + fimTotal;
            }
        
        int duracaoHoras = duracaoMinutos / 60;
        int duracaoRestoMin = duracaoMinutos % 60;


        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoRestoMin + " MINUTO(S)");

        sc.close();
 
    }
 
}
