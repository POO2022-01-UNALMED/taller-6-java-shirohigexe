package vehiculos;

public class Camion extends Vehiculo{
	public static int totalCamiones = 0;
	private int ejes;

	public Camion(String placa, String nombre, int precio, int peso,
			Fabricante fabricante,int ejes) {
		super(placa,2,80, nombre,  precio, peso, "4X2", fabricante);
		totalCamiones++;
		this.ejes = ejes;
	}
	
	
	
}
