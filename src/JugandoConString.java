


public class JugandoConString {

	public static void main(String[] args) {

		// convertir a minusculas
		// convertir a mayusculas
		// mostrar numero de caracteres
		// mostrar posición letra K
		// Separar en dos variables el nombre y el apellido
		//

		String manolo = "Manolo Kabezabolo";

		System.out.println(manolo.toLowerCase());
		System.out.println(manolo.toUpperCase());
		System.out.println(manolo.length());
		System.out.println(manolo.indexOf('K'));

		String nombre = manolo.substring(0, 6);
		String apellido = manolo.substring(7);
		System.out.println("Nombre: " + nombre + " - Apellido:" + apellido);

		/* COMPARANDO */
		String c1 = "casa";
		String c2 = "Casa";

		/* Comparar c1 y c2 con equals y equalIgnoreCase */
		System.out.println(c1.equals(c2));
		System.out.println(c1.equalsIgnoreCase(c2));

		/* LIMPIAR ENTRADAS DE DATOS */
		String c3 = "perro";
		String c4 = "     perro     ";

		System.out.println("Los dos perros son iguales: " + c3.equals(c4.trim()));

		/* las dos variables debes ser iguales */

		/*
		 * Mostrar longitud, contar todas las vocales, indicar numveces que aparece 'at'
		 */
		String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur pretium odio rutrum dignissim volutpat.  Maecenas scelerisque elit quis posuere tempus. Phasellus dictum nibh varius nunc ornare, pharetra consequat nibh pharetra. Suspendisse aliquam metus vel orci suscipit, ac venenatis dolor maximus. Suspendisse ac dapibus lectus. Maecenas ac odio diam.Aenean at nulla ornare quam vestibulum luctus. Fusce sapien ligula, imperdiet eget neque ut, pellentesque sollicitudin nunc. Integer vestibulum facilisis nisl ornare consectetur. Curabitur sem magna, porttitor in ex vel, faucibus porta orci. Suspendisse at interdum arcu. Aliquam vel quam eget justo porttitor auctor eget volutpat turpis. Nullam finibus risus mauris. Integer euismod vestibulum metus, et rutrum eros consectetur aliquam. Donec bibendum lorem sed enim mollis feugiat.Morbi ut nunc aliquet diam luctus laoreet. Nam lacinia diam est, in convallis dui vestibulum eu. Praesent eget sodales sem, efficitur pulvinar arcu. Vestibulum accumsan tortor lorem, nec fermentum eros lacinia ac. Praesent hendrerit lacus vel lectus porttitor condimentum. Donec tristique venenatis odio, ac consequat leo laoreet at. Vestibulum vitae bibendum elit, vel varius nibh. Donec placerat vitae nisi condimentum dignissim. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.In vel nulla dapibus, pharetra purus non, dapibus est. Nullam urna nisl, auctor et ultrices ut, iaculis semper felis. Etiam dapibus est in sapien posuere posuere. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aenean elit mi, rhoncus ac eros et, pellentesque elementum odio. Sed lacinia quam nunc, at euismod turpis placerat sed. Quisque vel quam maximus odio interdum faucibus. Vestibulum bibendum egestas vulputate. Sed maximus aliquam malesuada. Fusce ac faucibus arcu, fermentum pellentesque orci. In magna mi, suscipit at euismod at, sollicitudin dapibus nisi. Morbi gravida erat fermentum lobortis tempor.Proin a orci a velit dignissim iaculis. Etiam quis leo risus. Mauris mollis efficitur est, ut lacinia turpis interdum vel. Sed feugiat mollis nunc, pharetra finibus turpis euismod eu. Proin interdum eros quis tellus sodales sollicitudin. Curabitur tincidunt neque ac orci tempus, vel pretium mi aliquet. Donec iaculis purus augue, sed interdum mauris eleifend ut. Cras a nulla aliquet, luctus erat a, suscipit est. Integer eget suscipit neque. Aenean volutpat non augue eget elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Pellentesque sed suscipit lorem. Donec suscipit ante dictum diam dignissim viverra.Nam at libero venenatis, tempus justo vitae, feugiat nunc. Ut convallis lorem ut tellus dignissim, sed dapibus nulla congue. Mauris placerat nulla sit amet cursus pellentesque. Nam mi risus, dignissim sed ligula eu, vehicula egestas dui. Proin augue dolor, placerat quis cursus at, lacinia in elit. Nunc tempus imperdiet elit, vel varius velit interdum sit amet. Sed tincidunt, felis a vestibulum ultricies, ex urna fringilla nisl, a ornare lectus sem ac ex. Cras faucibus, ex varius tempus dapibus, nibh enim cursus nibh, ut porttitor enim neque sed nunc. Nam nunc erat, ullamcorper ac nunc nec, lacinia tristique justo. Duis consectetur mi vitae dolor tempus, nec dictum dolor lacinia. Nulla elementum ut mauris non fermentum. Cras pretium congue ante eget sagittis.";
		System.out.println("Longitud lorem: " + lorem.length());
		System.out.println("Lorem ipsum tiene " + lorem.split(" ").length + " palabras");

		int contadorVocales = 0;
		char[] aVocales = lorem.toLowerCase().toCharArray();
		char vocal = 'a';
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < aVocales.length; i++) {
			vocal = aVocales[i];
			for (int j = 0; j < vocales.length; j++) {
				if (vocales[j] == vocal) {
					contadorVocales++;
				}
			}
		}

		System.out.println("Lorem ipsum tiene: " + contadorVocales + " vocales.");

		int contadorAT = 0;

		for (int i = 0; i < aVocales.length; i++) {
			if ((aVocales[i] == 'a') && (aVocales[i + 1] == 't')) {
				contadorAT++;
				//System.out.println("Posicion: " + i);
			}
		}
		System.out.println("Lorem ipsum tiene: " + contadorAT + " AT.");
		
		//TEST
		UtilidadesString.buscarpalabra(lorem, "at");

	}

}
