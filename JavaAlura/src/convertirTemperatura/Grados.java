package convertirTemperatura;

import javax.swing.JOptionPane;

public class Grados extends Temperatura {

	public Grados() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grados(double tempResultado, double tempIngreso) {
		super(tempResultado, tempIngreso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void validar() {
		
		try {
			setTempIngreso(Double.parseDouble(JOptionPane.showInputDialog(null,
					"ingresa la temperaturaen grados celsius(°C) que deseas convertir:")));
			ResultadoGradosaFaren(getTempIngreso());
 			}catch(Exception e) {
 				JOptionPane.showMessageDialog(null, "solo ingresa numeros, sin puntos ni comas");
				
 			}
		
		
	}
	
	
	
}
