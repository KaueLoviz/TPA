import java.util.Scanner;
public class Ex1 {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		double vi;
		int meses;
		System.out.println("Digite o valor do investimento:");
		vi=ler.nextDouble();
		System.out.println("Digite a quantidade de meses:");
		meses=ler.nextInt();
		System.out.printf("Seu novo valor é de: R$ %.2f",juros(vi, meses));
	}
	public static double juros(double v1, int v2){
		double por, resultado, soma=0;
		soma=v1;
		for(int i=1; i<=v2; i++) {
			por=soma*1/100;
			soma=soma+por;
		}
		resultado=soma;
		return resultado;
	}
}