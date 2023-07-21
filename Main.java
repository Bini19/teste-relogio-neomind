import java.util.Scanner;
import java.util.GregorianCalendar;

public class Main {
  public static void main(String[] args) {
    System.out.println("Informar a hora entre 00:00 e 12:00");
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a hora:");
    int hora = sc.nextInt();
    System.out.print("Digite o minuto:");
    int minuto = sc.nextInt();
    
    if (hora <0 || minuto < 0 || hora >12 || minuto > 60) {
        System.out.println("Entrada inválida!");
        return ;
    }
    Relogio relogio = new Relogio(); 
		GregorianCalendar g = new GregorianCalendar(2023, 07, 20, hora, minuto);
		long diferenca = relogio.retornaAnguloRelogio(g);
  
  System.out.println("A diferença dos ângulo entre os 2 ponteiros do relógio é: " + diferenca);
    
  }
  
  
}