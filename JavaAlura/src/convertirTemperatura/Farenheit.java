package convertirTemperatura;

import javax.swing.JOptionPane;

public class Farenheit extends Temperatura {

	
	
	
	
	public Farenheit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Farenheit(double tempResultado, double tempIngreso) {
		super(tempResultado, tempIngreso);
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public void validar() {
		try {
			setTempIngreso(Double.parseDouble(JOptionPane.showInputDialog(null,
					"ingresa la temperaturaen grados celsius(°C) que deseas convertir:")));
			ResultadoFarenaGrados(getTempIngreso());
 			}catch(Exception e) {
 				JOptionPane.showMessageDialog(null, "solo ingresa numeros, sin puntos ni comas");
				
 			}
		
	}

}
