package convertirTemperatura;

import javax.swing.JOptionPane;

import interfaceValidar.Validar;

public abstract class Temperatura implements Validar {

	
	private double tempResultado;
	private double tempIngreso;
	
	
	
	public Temperatura(double tempResultado, double tempIngreso) {
		super();
		this.tempResultado = tempResultado;
		this.tempIngreso = tempIngreso;
	}
	
	public Temperatura() {}

	public void ResultadoGradosaFaren(double valor) {
		this.tempResultado=((valor * 9/5) + 32);
		JOptionPane.showMessageDialog(null, "Tienes: "+ tempResultado+" °F");
	}
	
	public void ResultadoFarenaGrados(double valor) {
		this.tempResultado=((valor - 32) * 5/9);
		JOptionPane.showMessageDialog(null, "Tienes: "+ tempResultado+" °C");
	}
	
	
	
	
	
	
	public double getTempResultado() {
		return tempResultado;
	}
	public void setTempResultado(double tempResultado) {
		this.tempResultado = tempResultado;
	}
	public double getTempIngreso() {
		return tempIngreso;
	}
	public void setTempIngreso(double tempIngreso) {
		this.tempIngreso = tempIngreso;
	}
	
	
	
	
	
	
	
}
