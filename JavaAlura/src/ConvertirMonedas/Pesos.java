package ConvertirMonedas;

import javax.swing.JOptionPane;

public class Pesos extends Monedas {

	public Pesos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pesos(double moneda, double ingreso) {
		super(moneda, ingreso);
		// TODO Auto-generated constructor stub
	}

	public void validaEuroaPeso() {

		try {
			setIngreso(Double.parseDouble(
					JOptionPane.showInputDialog(null, "ingresa la cantidad de dinero(Pesos) que deseas convertir:")));
			ConvertirEurosaPesos(getIngreso());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "solo ingresa numeros, sin puntos ni comas");

		}
	}

	@Override
	public void validar() {

		try {
			setIngreso(Double.parseDouble(
					JOptionPane.showInputDialog(null, "ingresa la cantidad de dinero(Pesos) que deseas convertir:")));
			ConvertirDolaresaPesos(getIngreso());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "solo ingresa numeros, sin puntos ni comas");

		}

	}
}
