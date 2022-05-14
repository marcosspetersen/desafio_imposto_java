import java.util.Locale;
import java.util.Scanner;

public class imposto_java {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			double rendaSalario, rendaServico, rendaCapital, gastosMedicos, gastosEducacionais;
			double impostoSalario, impostoServico, impostoCapital, maximoDedutivel, gastoDedutivel;
			double impostoBruto, abatimento, impostoDevido;
			
			System.out.print("Renda anual com salário: ");
			rendaSalario = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			rendaServico = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			rendaCapital = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			gastosMedicos = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			gastosEducacionais = sc.nextDouble();
			
			if (rendaSalario < 36000) {
				impostoSalario = rendaSalario * 0;
			}else if (rendaSalario <= 60000) {
				impostoSalario = rendaSalario * 0.1;
			}
			else {
				impostoSalario = rendaSalario * 0.2;
			}
			
			impostoServico = rendaServico * 0.15;
			impostoCapital = rendaCapital * 0.20;
			impostoBruto = impostoSalario + impostoServico + impostoCapital;
			
			maximoDedutivel = impostoBruto * 0.3;
			gastoDedutivel = gastosMedicos + gastosEducacionais;
			
			if (gastoDedutivel > maximoDedutivel) {
				abatimento = maximoDedutivel;
			}
			else {
				abatimento = gastoDedutivel;
			}
			
			impostoDevido = impostoBruto - abatimento;
			
			System.out.println();
			System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
			System.out.println();
			System.out.println("CONSOLIDADO DE RENDA:");
			System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
			System.out.printf("Imposto sobre serviços: %.2f%n", impostoServico);
			System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);
			System.out.println();
			System.out.println("DEDUÇÕES:");
			System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
			System.out.printf("Gastos dedutíveis: %.2f%n", gastoDedutivel);
			System.out.println();
			System.out.println("RESUMO:");
			System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
			System.out.printf("Abatimento: %.2f%n", abatimento);
			System.out.printf("Imposto devido: %.2f%n", impostoDevido);
			
		sc.close();

	}

}
