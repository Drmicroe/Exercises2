package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Domingo -> 1
		// Quarta -> 4
		// Terça -> 3
		
		Scanner entrada = new Scanner(System.in);
		
	    System.out.print("Digite o dia da semana: ");
	    
	    String dia = entrada.next(); 
	    
	    if("domingo".equalsIgnoreCase (dia)) {
	    	System.out.println(1);
	   
	  } else if("segunda".equalsIgnoreCase (dia)) {
		  System.out.println(2);
	  } else if("terça".equalsIgnoreCase (dia)) {
		  System.out.println(3); 
	  } else if("quarta".equalsIgnoreCase(dia))	{
		  System.out.println(4);
	  } else if("quinta".equalsIgnoreCase(dia)) { 
		  System.out.println(5);
	  } else if("sexta".equalsIgnoreCase(dia)) {
		  System.out.println(6);
	  } else if("sabado".equalsIgnoreCase(dia)) {
		  System.out.println(7);
	  }
	  
	    
	     entrada.close();

  } 
}

