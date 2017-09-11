package com.ipartek.formacion.javalibro.pojo;
import java.util.ArrayList;
import java.util.Scanner;

public class Cancion {

	private String titulo;
	private String artista;
	private String duracion;

	public Cancion() {
		super();
		
		this.titulo = "";
		this.artista = "";
		this.duracion = "";

	}

	public Cancion(String titulo, String artista, String duracion) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String toString() {
		return "TíTULO=" + this.titulo + ", ARTISTA=" + this.artista + ", DURACIÓN=" + this.duracion;
	}
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	static ArrayList<Cancion> listaCanciones = new ArrayList<Cancion>();
	static int opcionMenu = 1;
	static Scanner sc = new Scanner(System.in);
	static int numCancion;

	public static void main(String[] args) {
		

		crearLista();
		opcionMenu = mostrarMenu();

		while (opcionMenu != 5)
			switch (opcionMenu) {
			case 1:
				listarCanciones();
				mostrarMenu();
				break;
			case 2:

				listarCanciones();
				eliminarCanciones();
				listarCanciones();
				mostrarMenu();
				break;
			case 3:
				crearCancion();
				listarCanciones();
				mostrarMenu();
				break;

			case 4:
				listarCanciones();
				mostrarDetalle();
				mostrarMenu();
				break;

			}
		mostrarDespedida();

	}

	private static void mostrarDespedida() {
		
		System.out.println("Agur! ");
		sc.close();

	}

	private static void crearCancion() {
		
		String titulo = "";
		String artista = "";
		String duracion = "";

		System.out.println("Título de la canción: ");
		sc = new Scanner(System.in);
		titulo = sc.nextLine();

		System.out.println("Artista de la canción: ");
		sc = new Scanner(System.in);
		artista = sc.nextLine();

		System.out.println("Duración de la canción: ");
		sc = new Scanner(System.in);
		duracion = sc.nextLine();

		listaCanciones.add(new Cancion(titulo, artista, duracion));

	}

	private static void mostrarDetalle() {
		

		System.out.println("¿De qué canción quieres ver el detalle?: ");
		sc = new Scanner(System.in);
		numCancion = sc.nextInt();

		System.out.println("Canción " + numCancion + ": " + listaCanciones.get(numCancion));

	}

	private static void crearLista() {
		

		listaCanciones.add(new Cancion("Wonderful World", "Sam Cooke", "2:05"));
		listaCanciones.add(new Cancion("Ex's & Oh's", "Elle King", "4:05"));
		listaCanciones.add(new Cancion("Dante's Prayer", "Loreena McKennitt", "7:11"));
		listaCanciones.add(new Cancion("Mmm...", "SLaura Izibor", "3:25"));
		listaCanciones.add(new Cancion("Wild Spain", "Ska-P", "4:25"));
		listaCanciones.add(new Cancion("Califormia Dreamin'", "The Mamas & The Papas", "2:37"));
		listaCanciones.add(new Cancion("Crystal", "Stevie Nicks", "5:57"));
		listaCanciones.add(new Cancion("Wonderful World", "Sam Cooke", "2:05"));
		listaCanciones.add(new Cancion("Mrs. Robinson", "Simon & Garfunkel", "3:50"));
		listaCanciones.add(new Cancion("Malibu", "Miley Cyrus", "3:51"));

	}

	private static int mostrarMenu() {
		
		System.out.println("\n\nMENU CANCIONES\n_____________________________\n" + "1. Listar canciones\n"
				+ "2. Eliminar canciones\n" + "3. Crear canciones\n" + "4. Detalle canciones\n" + "5. Salir");

		opcionMenu = sc.nextInt();
		return opcionMenu;

	}

	public static void listarCanciones() {
		for (int i = 0; i < listaCanciones.size(); i++) {
			System.out.println("Canción " + i + ": " + listaCanciones.get(i).getTitulo());

		}

	}

	public static void eliminarCanciones() {
		System.out.println("¿Qué cancion quieres borrar?");
		sc = new Scanner(System.in);

		numCancion = sc.nextInt();
		listaCanciones.remove(numCancion);

	}

}
