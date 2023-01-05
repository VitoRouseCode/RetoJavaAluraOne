package ConvertirMonedas;

import javax.swing.JOptionPane;

import interfaceValidar.Validar;

public abstract class Monedas  implements Validar{

	private double moneda;
	private double ingreso;
	
	
	
	
	
	public Monedas(double moneda, double ingreso) {
		super();
		this.moneda = moneda;
		this.ingreso = ingreso;
	}
	
	public Monedas() {}

	public void ConvertirMoneda(double valor) {
		
		this.moneda=0.00020*valor;
		JOptionPane.showMessageDialog(null, "Tienes: $"+ moneda+" Dolares");
		
	}
	
	public void ConvertirPesosaEuros(double valor) {
		
		this.moneda=0.00019*valor;
		JOptionPane.showMessageDialog(null, "Tienes: $"+ moneda+" Euros");
	}
	
public void ConvertirEurosaPesos(double valor) {
		
		this.moneda=5234.69*valor;
		JOptionPane.showMessageDialog(null, "Tienes: $"+ moneda+" Pesos");
	}

public void ConvertirDolaresaPesos(double valor) {
	
	this.moneda=4800*valor;
	JOptionPane.showMessageDialog(null, "Tienes: $"+ moneda+" Pesos");
}
	
	
	
	

	public double getIngreso() {
		return ingreso;
	}

	public void setIngreso(double d) {
		
		this.ingreso = d;
		
	}
	
	public double getDolares() {
		return moneda;
	}

	public void setDolares(int dolares) {
		moneda = dolares;
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


