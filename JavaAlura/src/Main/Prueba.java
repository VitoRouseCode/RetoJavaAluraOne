package Main;

import javax.swing.JOptionPane;

import ConvertirMonedas.Dolares;
import ConvertirMonedas.Euros;
import ConvertirMonedas.Pesos;
import convertirTemperatura.Farenheit;
import convertirTemperatura.Grados;

public class Prueba {

	public static void main(String[] args) {
		String opc="";
		String opc1="";
		String opc2="";
		int fin=1;
		
		
		Euros euros = new Euros();
		Dolares dolar=new Dolares();
		Pesos pesos =new Pesos();
		Grados grados=new Grados();
		Farenheit farenheit=new Farenheit();
		
		
		
	do {
		
		 opc = JOptionPane.showInputDialog(
 				null,"selecciona una opcion de conversion",
 				"Menu",JOptionPane.PLAIN_MESSAGE,
 				null,new String[] {"convertir monedas",
 								   "convertir temperatura"},"selecciona").toString();
         
         
         switch(opc){
             
             case "convertir monedas":
            	 
			            	 opc1 = JOptionPane.showInputDialog(
			          				null,"selecciona una opcion de conversion","Menu",
			          				JOptionPane.PLAIN_MESSAGE,
			          				null,new String[] {"convertir de Pesos a Dolares",
			          						"convertir de Pesos a Euros",
			          						"convertir de dolares a pesos",
			          						"convertir de euros a pesos"},"selecciona").toString();
	            	 switch(opc1) {
	            	 			
	            	 case "convertir de Pesos a Dolares":
	            		 			dolar.validar();
	            		 			
	            	 				break;
	            	 				
	            	 case "convertir de Pesos a Euros":
	            		 			euros.validar();
	            		 			break;
	            		 			
	            	 case "convertir de dolares a pesos":
	            		 			pesos.validar();
     		 						break;
     		 						
	            	 case "convertir de euros a pesos":
	 								pesos.validaEuroaPeso();
	 								break;
	            	 }
	            	 break;
	            	 
             case "convertir temperatura":
            	 
            	 opc2 = JOptionPane.showInputDialog(
	          				null,"selecciona una opcion de conversion",
	          				"Menu",JOptionPane.PLAIN_MESSAGE,
	          				null,new String[] {"convertir de grados centigrados a grados farenheit",
	          						"convertir de grados farenheit a grados centigrados",},
	          						"selecciona").toString();
	          				
	          						
				     	 switch(opc2) {
				     	 			
				     	 case "convertir de grados centigrados a grados farenheit":
				     	 				grados.validar();
				     	 				break;
				     	 				
				     	 case "convertir de grados farenheit a grados centigrados":
				     		 			farenheit.validar();
				     		 			break;
				     	 	}
         

         }
         	fin=JOptionPane.showConfirmDialog(null,"deseas seguir haciendo conversiones?");
    
	
	} while(fin==0);
	
			JOptionPane.showMessageDialog(null, "has finalizado el programa!");
	}
	
}
