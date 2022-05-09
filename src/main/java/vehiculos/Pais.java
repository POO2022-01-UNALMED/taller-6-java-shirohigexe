package vehiculos;
import java.util.ArrayList;

public class Pais {
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private int cantidadVentas = 0;
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor(){
		Pais posiblereturn = new Pais("THISISATESTOBJEST");
		
		for(int i =0; i < paises.size(); i++) {
			Pais pais1 = paises.get(i);
			if(pais1.getCantidadVentas() > posiblereturn.getCantidadVentas()) {
				posiblereturn = pais1;
			}
		}
		
		return posiblereturn;
	}
}
