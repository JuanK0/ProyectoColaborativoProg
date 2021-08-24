package uptc.edu.Logic;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * clase que permite dar ejecucucion al programa
 * @author user
 *
 */
public class Run {
	
	
/**
 * metodo main todo lo que esta dentro de el se ejecuta
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		Logic log =new Logic();
		int op=0;
		while(op!=11) {
			System.out.println("bienvenido al menu a continuacion se le mostrara una serie de opciones:");
			System.out.println("1.Convertir en nombre propio el contenido de una cadena ");
			System.out.println("2.buscar cadena de caracteres");
			System.out.println("3.encriptar");
			System.out.println("4.desencriptar");
			System.out.println("5.llenar caracteres");
			System.out.println("6.borrar caracteres");
			System.out.println("7.interseccion");
			System.out.println("8.diferencia");
			System.out.println("9.borrar caracteres de izquierda a derecha ");
			System.out.println("10.validar direccion de correo electronico");
			System.out.println("11.salir");
			System.out.println("Elija la opcion que desee");
			op=sc.nextInt();
		
			switch (op) {
			case 1:
				System.out.println(log.OwnName());;
				break;

			case 2:
				System.out.println("ingrese la cadena que desea buscar");
				String word2=sc.next();
				System.out.println(log.SeachWord(word2));
				break;
			case 3:
				System.out.println(log.encryptedCode());
				break;

			case 4:
				System.out.println(log.decryptedCode());
				break;
			case 5:
				System.out.println("ingrese el caracter con el que va a llenar la frase");
		        char chars=sc.next().charAt(0);
		        System.out.println("ingrese el numero de veces que el caracter quiere que se repita ");
		        int numer=sc.nextInt();
		        System.out.println("ingrese en que lado quiere rellenar con los caracteres ");
		        String position=sc.next();
		        System.out.println(log.fillchars(chars, numer, position));
				break;

			case 6:
				System.out.println("ingrese el caracter que desea eliminar ");
		        String txt=sc.next();
		        System.out.println(log.DeleteChar(txt));
				break;
			case 7:
				 System.out.println("ingrese la palabra a la cual le va a hacer interseccion");
			        String word=sc.next();
			        System.out.println(log.intersection(word));
				break;

			case 8:
				System.out.println("ingrese la palabra a la cual le va a hacer diferencia");
		        String text=sc.next();
		        System.out.println(log.diference(text));
				break;
			case 9:
				System.out.println("dijite el texto");
				String text2=sc.nextLine();
				sc.nextLine();
				String[] leftOrRigh = {"derecha", "izquierda"};
				System.out.println("por donde desea borrar?");
				String orientation=sc.next();
				System.out.println(log.deletecharacter(text2, orientation));
				
				break;

			case 10:
				
				break;
				
			case 11:
				System.out.println("gracias por usar la aplicacion");
				break;
			default:
				System.out.println("opcion digitada no valida");
				break;
			}
		
		}
	}
	

}
