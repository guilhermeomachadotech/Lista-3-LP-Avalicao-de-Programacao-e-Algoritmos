public class AlturaJoaoEAlturaPedro {
	public static void main (String args[]) {
		double alturaJoao, alturaPedro;
		int ano=1;
		alturaJoao=134;
		alturaPedro=145;
		while (alturaJoao<=alturaPedro) {
			alturaJoao=alturaJoao+2.5;
			alturaPedro=alturaPedro+2.0;
			ano++;
		}
		System.out.println ("Demoraria "+ano+" anos para que João ultrapassasse a altura de Pedro.");
	}
}

