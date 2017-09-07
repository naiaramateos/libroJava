import java.util.ArrayList;
import java.util.Scanner;

public class Cancion {

	private String titulo;
	private String artista;
	private String duracion;

	public Cancion() {
		super();
		// TODO implementar
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList listaCanciones = new ArrayList();

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

		System.out.println("MENU CANCIONES\n_____________________________\n" + "1. Listar canciones\n"
				+ "2. Eliminar canciones\n" + "3. Crear canciones\n" + "4. Detalle canciones");

		Scanner sc = new Scanner(System.in);
		int opcionMenu = 0;
		opcionMenu = sc.nextInt();

		switch (opcionMenu) {
		case 1:
			listarCanciones(listaCanciones);
			break;
		}

	}

	public static void listarCanciones(ArrayList listaCanciones)
	{
		for (int i = 0; i < listaCanciones.size(); i++) {
			System.out.println("Canción " + i + ": " + listaCanciones.get(i));

		}

		
		
	}

}
