import java.util.Scanner;
// DepressoBot
public class trabalho2 {

	public static void main(String[] args) {
		Scanner obter = new Scanner(System.in);
		
		System.out.println("O que vc está sentindo?");
		System.out.println("1 - Depressão");
		System.out.println("2 - Ansiedade");
		System.out.println("3 - Em um loop de procrastinação");
		System.out.print("Digite uma opção: ");
		int input = obter.nextInt();
		int input2;
		String input3;
		switch(input) {
		case 1:
			System.out.print("Certo, em uma escala de 1-10, como você se sente quando acorda de manhã?");
			input2 = obter.nextInt();
			if(input2 <= 3) {
				System.out.print("Por quanto tempo você se sente assim?");
				input3 = obter.next();
				System.out.println("");
				System.out.println("É melhor se consultar com um psicólogo, mas aqui são algumas dicas para você");
				System.out.println("Lembre-se que depressão é uma doença que pode ser vencida, mesmo que pareça tudo sem saída, você pode mudar o jeito que você vê o mundo");
				System.out.println("- Converse um pouco com seus amigos. Conversar é uma das melhores formas de lidar com problemas");
				System.out.println("- Cuide bem do seu corpo. Pratique um pouco de exercício quando você conseguir.");
				System.out.println("- Durma bem. O sono e o humor andam lado a lado.");
				System.out.println("- Lembre de consultar um psicólogo");
			}
			break;
		case 2:
			System.out.println("Certo, em uma escala de 1-10, como você se sente quando acorda de manhã? ");
			input2 = obter.nextInt();
			System.out.println("Por quanto tempo você se sente assim? ");
			input3 = obter.next();
			
			System.out.println("");
			System.out.println("Que tipo de coisas te deixam ansioso? ");
			input3 = obter.next();
			System.out.print("Você tem ideias obsessivas? ");
			input3 = obter.next();
			System.out.print("Não para de pensar em hipóteses sobre o que poderá (ou não) acontecer? ");
			input3 = obter.next();
			System.out.print("Essa sequência de pensamentos tem algum efeito positivo ou serve apenas para piorar a situação? ");
			input3 = obter.next();
			System.out.println("");
			System.out.println("É melhor se consultar com um psicólogo, mas aqui são algumas dicas para você");
			System.out.println("Lembre-se que a ansiedade não é um resultado de preguiça ou de falta de interesse. É uma resposta de medo do seu corpo de coisas que acontecem com você");
			System.out.println("- Converse com amigos. Fale com eles sobre coisas que você gosta.");
			System.out.println("- Cuide bem do seu corpo. O exercício ajuda a liberar sua ansiedade");
			System.out.println("- Se algo em específico te deixa ansioso, algo chamado gatilho, tente respirar fundo e fale com alguém para te ajudar a lidar com esse gatilho.");
			
		}
		
	}

}
