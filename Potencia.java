import java.util.Scanner;
public class Potencia {
	public static void main (String args []) {
		Scanner ler=new Scanner (System.in);
		int base, potencia=1, expoente, i=1;
		System.out.println ("Digite a base da pot�ncia:");
		base=ler.nextInt();
		System.out.println ("Digite o expoente da pot�ncia:");
		expoente=ler.nextInt();
		while (i<=expoente) {
			potencia=potencia*base;
			i++;
		}
		System.out.println ("O resultado da pot�ncia �="+potencia);
		ler.close();
	}
}
