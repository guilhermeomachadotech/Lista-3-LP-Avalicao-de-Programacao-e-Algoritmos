import java.util.Scanner;
public class Fatoracao {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		int num, fat=1, i=1;
		System.out.println ("Digite o n�mero a ser fatorado: ");
		num=ler.nextInt();
		while (i<=num) {
			fat=i*fat;
			i++;
		}
		System.out.println (fat);
		ler.close();
	}
}
