import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;

public class Arquivo
{

	public static void main(String[] args) throws IOException 
	{
		Scanner teclado = new Scanner(System.in);
		
		File arq = new File("menu.txt");
		
		int opcao = 0;
	    
	    do 
	    {
	    
			 System.out.println("\n\n    ### MENU DE INTERAÇÃO ###");
		     System.out.println("\n ===========================");
		     System.out.println(" |     1 - Inserir Nome    |");
		     System.out.println(" |     2 - Exibir Nomes    |");
		     System.out.println(" |     3 - Apagar tudo     |");
		     System.out.println(" |     0 - Sair            |");
		     System.out.println(" ===========================\n");
		     
		     System.out.print("Opção -> ");
		     opcao = teclado.nextInt();
		
		     switch(opcao)
		     {
		         case 1:
		        	 
		        	 System.out.println("\nOpção 'INSERIR NOME' escolhida!\n");
	        		 System.out.print("Digite um nome: ");
	        		 String nome = teclado.next();
		        	 
	        		 PrintWriter writer = new PrintWriter(new FileWriter(arq, true));
		        	 writer.println(nome);
		        	 writer.close();
		             break;
		         
		         case 2:
		        	 
		        	 try 
		        	 {
		                 FileReader reader = new FileReader(arq);
		                 int character;
		                 System.out.print("\n");
		      
		                 while ((character = reader.read()) != -1)
		                 {
		                     System.out.print((char) character);
		                 }
		          
		                 reader.close();
		      
		             } catch (IOException e) 
		        	 {
		                 e.printStackTrace();
		        	 }
		             break;
		             
		         case 3:
		        	 
		        	 arq.delete();
		        	 
		        	 System.out.println("\nArquivo apagado!"); 
		             break;
		             
		         case 0:
		        	 break;
		        	 
		         default:
		             System.out.println("Opção Inválida!");
		             break;
		     }

	    }while (opcao != 0);
		
		teclado.close();
	}

}
