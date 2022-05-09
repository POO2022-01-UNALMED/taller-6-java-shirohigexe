package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private static ArrayList<Fabricante> Fabricantees = new ArrayList<Fabricante>();
	public int totalFabrica = 0;
	private String nombre;
	private Pais pais;
	
	
	
	public Fabricante( String nombre, Pais pais) {
		this.pais = pais;
		this.nombre = nombre;
		Fabricantees.add(this);
	}
	
	public static Fabricante fabricaMayorVentas(){
		Fabricante posiblereturn = new Fabricante("TEST" , new Pais("THISISATESTOBJEST"));
		for(int i =0; i < Fabricantees.size(); i++) {
			Fabricante pais1 = Fabricantees.get(i);
			
			if(pais1.totalFabrica >= posiblereturn.totalFabrica) {
				posiblereturn = pais1;
			}
		}
		
		return posiblereturn;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTotalFabrica() {
		return totalFabrica;
	}
	public void setTotalFabrica(int totalFabrica) {
		this.totalFabrica = totalFabrica;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
