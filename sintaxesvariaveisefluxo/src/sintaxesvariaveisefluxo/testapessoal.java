
package sintaxesvariaveisefluxo;

import java.util.Scanner;

public class testapessoal {
	public static void main(String[] args) {
        System.out.println("Bem vindos a escola regional");
		
      Scanner scanner =  new Scanner(System.in);

		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();
        boolean acompanhado = true;
		String nomes = " joao, ruan, gustavo, lucas, e maria ";

		if (idade >= 15) {
			System.out.println("Pode entrar " + nomes + "voces tem a idade necessaria para estar nessa turma, bons estudos!");

		} else if (idade >= 14 && acompanhado ) {
			System.out.println("Vocês podem entrar, pois estão acompanhados pelo seu responsavel hoje.");
		} else if (idade < 14) {
			System.out.println("Não pode entrar, procurem outra turma.\n");
		
		}
              
		
		int saladeaula2 = 102;
		int saladeaula1 = 105;
		int sala = saladeaula2;
       String coordenacao = "sala do diretor";
		
		switch (sala) {

		case 105:
			saladeaula1 = 105;
			break;
		case 102:
			saladeaula2 = 102;
			break;
        
		
		
		
		default:
			break;
		}
		System.out.println("essa e a sala  "+ saladeaula2+"\n");
        System.out.println("Caso tenham alguma duvida comparecer a "+coordenacao+  " no final do corredor.\n ");
	if (idade <14 ){
		System.out.println("procure pela sala "+saladeaula1+nomes);
		
	}
	}
    
}
