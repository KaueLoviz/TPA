import java.util.Scanner;
public class Ex2 {
	public static void main (String [] args) {
		menu();
	}
	public static void menu() {
		Scanner ler=new Scanner (System.in);
		double tg;
		int op, jur;
		System.out.println("Digite o total de gastos:");
		tg=ler.nextDouble();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Escolha uma opção:");
		System.out.println("Opção 1: a vista com 10% de desconto.");
		System.out.println("Opção 2: em 2 vezes (Preço da etiqueta).");
		System.out.println("Opção 3: de 3 até 10 vezes com 3% de júros ao mês (Somente para compras acima de R$100,00).");
		System.out.println("-----------------------------------------------------------------------------------------");
		op=ler.nextInt();
		if(op==1) {
				System.out.println("Você escolheu a opção 1.");
				System.out.printf("O valor a vista de sua prestação com 10% de desconto será de: R$ %.2f",op1(tg));
		}
		if(op==2) {
			System.out.println("Você escolheu a opção 2.");
			System.out.printf("O valor da sua prestação em 2 vezes é de: R$ %.2f",op2(tg));
			System.out.printf(", e o preço total é de: R$ %.2f",tg);
		}
		if(op==3) {
			System.out.println("Você escolheu a opção 3.");
			System.out.println("Escolha uma parcela entre 3 até 10 vezes:");
			jur=ler.nextInt();
			if(tg<100) {
				System.out.println("Este valor não é permitido!");
			}
			if(jur<3) {
				System.out.println("Este valor não é permitido!");
			}
			else if(jur>10) {
				System.out.println("Este valor não é permitido!");
			}
			else {
				System.out.printf("Você escolheu parcelar em "+jur+" vezes, e o valor de sua prestação é de: R$ %.2f",op3(tg, jur));
			}
		}
	}
	public static double op1(double v1) {
		double resultado, por;
		por=v1*10/100;
		resultado=v1-por;
		return resultado;
	}
	public static double op2(double v1) {
		double resultado, div;
		div=v1/2;
		resultado=div;
		return resultado;
	}
	public static double op3(double v1, int v2) {
		double resultado, por, div=0;
		div=v1;
		for(int i=1; i<=v2; i++) {
			por=div*3/100;
			div=div+por;
		}
		resultado=div;
		return resultado;
	}
	
}
