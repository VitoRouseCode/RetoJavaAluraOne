package ConvertirMonedas;

import javax.swing.JOptionPane;

public class Euros extends Monedas {

	public Euros(double moneda, double ingreso) {
		super(moneda, ingreso);
		// TODO Auto-generated constructor stub
	}

	public Euros() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void validar() {
		
		try {
 			setIngreso(Double.parseDouble(JOptionPane.showInputDialog(null,
 					"ingresa la cantidad de dinero(Pesos) que deseas convertir:")));
 			ConvertirPesosaEuros(getIngreso());
 			}catch(Exception e) {
 				JOptionPane.showMessageDialog(null, "solo ingresa numeros, sin puntos ni comas");
				
 			}
		
		
	}
	
	
	
}
