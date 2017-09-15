package com.ipartek.formacion.javalibro.excepciones;

public class PropagarExcepciones {

	public static void main(String[] args) throws Exception {
		
		
		comoMarron();

	}
	
	private static void lanzoExcepcion() throws Exception {
		
		System.out.println("LanzoExcepcion ENTRO");
		throw new Exception();
		//System.out.println("LanzoExcepcion SALGO");
		
	}
	private static void pasoMarron() throws Exception {
		
		System.out.println("pasoMarron ENTRO");
		lanzoExcepcion();
		System.out.println("pasoMarron SALGO");
		
	}
	private static void comoMarron() throws Exception {
		
		System.out.println("comoMarron ENTRO");
		
		pasoMarron();
//		try {
			//pasoMarron();
//		} catch (Exception e) {
//			
//			System.out.println("Ya me encargo yo de gestionar la excepción");
//		}
		System.out.println("comoMarron SALGO");
		
	}

}
