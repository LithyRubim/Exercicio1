package exercicio1;


import java.util.Scanner;


/*Crie uma classe Estudante. Cadastre o nome (string), idade( inteiro curto), numero(byte),
matricula (inteiro longo), nota1 e nota2 (real que tem no máximo duas casas decimais), valor
da mensalidade, situação (valor lógico). Atribua valores e mostre os dados na tela. Lembre-se
atribuir não é ler valoes*/


public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Lista l = new Lista();
		
		String menu = 
			"1 - Adicionar novo Aluno\n" +
			"2 - Remover Aluno\n" +
			"3 - Verificar quantidade adicionadas.\n" +
			"4 - Verificar se Aluno esta Cadastrado.\n" +
			"5 - Verificar se a lista está vazia.\n" +
			"6 - Listar os Alunos.\n" +
			"7 - Alterar um valor de uma determinada posição.\n" +
			"8 - Pegar um valor de uma determinada posição.\n" +
			"9 - Obtém o índice da palavra\n" +
			"10 - Obtém o último índice da palavra\n" +
			"11 - Verificar quantas vezes a palavra é encontrada\n"+
			"12 - Sair";
		
		System.out.println( menu );
		//String str = JOptionPane.showInputDialog( menu );
		int op = sc.nextInt();
		
		while ( op != 12 ) {
			switch ( op ) {
			case 1:
				System.out.println("Adicione uma palavra");
				String parametro = sc.next();
				l.add( parametro );
				break;
			case 2:
				if ( l.isEmpty() ) {
					System.out.println("lista vazia");
					
				} else {
					String removida = l.remove();
					System.out.println(
							"Palavra " + removida + 
							" removida da lista" );
				}
				break;
			case 3:
				System.out.println("número de palavras adicionadas ");
				System.out.println( l.size() );
				break;
			case 4:
				System.out.println("Digite uma palavra");
				String compara = sc.next();
				
				System.out.println( 
						l.contains( compara )
						? "Já foi adicionada" : "nao adicionada");
				break;
			case 5:
				System.out.println( l.isEmpty() ?
						"Vazia" :"há elementos" );
				break;
			case 6:
				if ( l.isEmpty() ) {
					System.out.println("Lista vazia");
				} else {
					l.list();
				}
				break;
			case 7:
				break;
			case 8:
				System.out.println("Digite uma posicao");
				int g = sc.nextInt();

				String pego = l.get( g );
				
				if ( pego != null ) {
					System.out.println( pego );
				} else {
					System.out.println("Posicao inexistente");
				}
				
				break;
			case 9:
				System.out.println("Digite uma nome");
				String lida = sc.next();
				
				int indice = l.indexOf( lida );
				
				if ( indice > -1) {
					System.out.println("O indice da palavra e o "
							+ indice);
				} else {
					System.out.println("A palavra " + lida + 
							" nao foi encontrada");
				}
				
				break;
			case 10:
				break;
			case 11:
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
			
			System.out.println( menu );
			op = sc.nextInt();
		}

	}

}
