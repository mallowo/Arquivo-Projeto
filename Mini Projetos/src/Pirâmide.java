import java.util.Scanner;

public class Pirâmide
{

	public static void main(String[] args) 
	{

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite números quaisquer separados por espaço: \n");
		String n = teclado.nextLine();
		
		int x = 0;
		int menorC = 0;
		int menor = 0;
		int soma = 0;
		int[] menores = new int[999];
		String[] num;
		
		num = n.split(" ");
		
		System.out.println("\nQuantidade: " + num.length);
		System.out.println("Strings: " + n);
		System.out.print("Lista: [");
		
		for (int i = 0; i < num.length; i++)
		{
			System.out.print(num[i]);
			
			if(i < num.length - 1)
				System.out.print(", ");
		}
		
		System.out.println("]");
		System.out.println("\n------------------------------\n");
		System.out.println("-- PIRAMIDE --\n");
		
		menores[0] = Integer.parseInt(num[0]);
	
		for(int i = 0; x < num.length; i++)
		{
			System.out.print("[");
			
			 for(int j = 0; j <= i; j++)
			 { 
				 System.out.print(num[x]);
				 
				 int nn = Integer.parseInt(num[x]);
				 
				 if (j == 0)
					menor = nn; 
				 
				 else 
					 if(nn < menor)
						 menor = nn;
		 	
				 if(j < i)
					System.out.print(", ");
				 
				 x++;
			 }
			 
			 menorC++;
			 menores[i] = menor;
			 menor = 0;
			 System.out.print("]");
			 System.out.print("\n");
		}
		
		System.out.println("\n-----------------------------\n");
		
		System.out.print("Os menores valores são: [");
		
		for (int i = 0; i < menorC; i++)
		{
			soma += menores[i];
			
			System.out.print(menores[i]);
			
			if(i < menorC - 1)
				System.out.print(", ");
		}
		 
		System.out.print("]");
		System.out.print("\nA soma dos menores valores é " + soma + ".");
		
		teclado.close();
	}

}