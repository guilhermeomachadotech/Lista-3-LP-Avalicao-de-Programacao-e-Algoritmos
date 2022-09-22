
public class Somatoria {
	public static void main (String args []) {
		int soma=0, i=1;
		while (i<=100) {
			soma=i+soma;
			i++;
		}
		System.out.println ("A somatória dos números 1 ao 100 é= "+soma);
	}
}
