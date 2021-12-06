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
		System.out.print("Eu posso te chamar de algo? ");
		String usuario = obter.next();
		
		String input2[] = new String[2];
		switch(input) {
		case 1:
			System.out.print("Certo, em uma escala de 1-10, como você se sente quando acorda de manhã?");
			input2[0] = obter.next();
			System.out.print("Por quanto tempo você se sente assim "+usuario+"? ");
			input2[1] = obter.next();
			System.out.println("");
			System.out.println("É melhor se consultar com um psicólogo "+usuario+", mas aqui são algumas dicas para você");
			System.out.println("Lembre-se que depressão é uma doença que pode ser vencida, mesmo que pareça tudo sem saída, você pode mudar o jeito que você vê o mundo");
			System.out.println("- Converse um pouco com seus amigos. Conversar é uma das melhores formas de lidar com problemas");
			System.out.println("- Cuide bem do seu corpo. Pratique um pouco de exercício quando você conseguir.");
			System.out.println("- Durma bem. O sono e o humor andam lado a lado.");
			System.out.println("- Lembre de consultar um psicólogo");
			System.out.println("- Caso você esteja com pensamentos suicidas, lembre-se de ligar para 188");
			
			break;
		case 2:
			System.out.println("Certo, em uma escala de 1-10, como você se sente quando acorda de manhã? ");
			input2[0] = obter.next();
			System.out.println("Por quanto tempo você se sente assim? ");
			input2[1] = obter.next();
			
			System.out.println("");
			System.out.println("Que tipo de coisas te deixam ansioso? ");
			input2[1] = obter.next();
			System.out.print("Você tem ideias obsessivas? ");
			input2[1] = obter.next();
			System.out.print("Você não para de pensar em hipóteses sobre o que poderá (ou não) acontecer? ");
			input2[1] = obter.next();
			System.out.print("Essa sequência de pensamentos tem algum efeito positivo ou serve apenas para piorar a situação? ");
			input2[1] = obter.next();
			System.out.println("");
			System.out.println("É melhor se consultar com um psicólogo "+usuario+", mas aqui são algumas dicas para você");
			System.out.println("Lembre-se que a ansiedade não é um resultado de preguiça ou de falta de interesse. É uma resposta de medo do seu corpo de coisas que acontecem com você");
			System.out.println("- Converse com amigos. Fale com eles sobre coisas que você gosta.");
			System.out.println("- Cuide bem do seu corpo. O exercício ajuda a liberar sua ansiedade");
			System.out.println("- Se algo em específico te deixa ansioso, algo chamado gatilho, tente respirar fundo e fale com alguém para te ajudar a lidar com esse gatilho.");
			System.out.println("- Caso você esteja com pensamentos suicidas, lembre-se de ligar para 188");
			break;
		case 3:
			System.out.println("Certo, em uma escala de 1-10, como você se sente negativamente com procrastinação? ");
			input2[1] = obter.next();
			System.out.println("Por quanto tempo isso acontece? ");
			input2[1] = obter.next();
			
			System.out.println("");
			System.out.println("Procrastinação é algo normal "+usuario+", não é preguiça e acontece com todo mundo, talvez você esteja com medo de terminar uma tarefa importante ou sem interesse, é totalmente normal.");
			System.out.println("Mas aqui algumas dicas para te ajudarem:");
			System.out.println("- Se convença que você pode fazer isso. Você pode vencer a procrastinação");
			System.out.println("- Divida uma tarefa grande em tarefas simples. Por exemplo, ao invés de dizer \"Vou fazer esse trabalho da escola em até 3 semanas\" fale \"Vou escolher 3 pontos principais, depois vou escolher uma pessoa ou um país para esse trabalho\"");
			System.out.println("- Não passe muito tempo planejando. Não tente passar 1 hora decidindo o que é mais importante pra hoje, passe 1 hora realmente fazendo essas coisas importantes");
			System.out.println("- Não passe muito tempo em uma tarefa, faça uma coisa por vez em pequenos intervalos de tempo, como 15 minutos ao invés de 2 horas");
			System.out.println("- Não deixe sua mente de carregar pra outras tarefas menos importantes, termine o que é importante *agora*");
			System.out.println("- Não lute contra as distrações, *elimine* as distrações. Se o YouTube é uma distração, tire ele do celular. Se seu celular é uma distração, remova ele da sua mesa e do seu quarto");
			
		}
		
	}

}
