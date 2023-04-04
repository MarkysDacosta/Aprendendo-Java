package sintaxesvariaveisefluxo;

public class testacase {

	public static void main(String[]args) {
		
		System.out.println("Testa case");
		
		
		int dia = 10;
		String diaSemana;

		switch (dia) {
		    case 1:
		        diaSemana = "Domingo";
		        break;
		    case 2:
		        diaSemana = "Segunda-feira";
		        break;
		    case 3:
		        diaSemana = "Terça-feira";
		        break;
		    case 4:
		        diaSemana = "Quarta-feira";
		        break;
		    case 5:
		        diaSemana = "Quinta-feira";
		        break;
		    case 6:
		        diaSemana = "Sexta-feira";
		        break;
		    case 7:
		        diaSemana = "Sábado";
		        break;
		    default:
		        diaSemana = "Dia inválido";
		        break;
		}

		System.out.println("O dia " + dia + " da semana é " + diaSemana + ".");

		
		
	}
	
	
}
