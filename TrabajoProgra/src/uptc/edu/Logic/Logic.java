package uptc.edu.Logic;
/**
 * 
 *clase uque contiene todos los metodos necesarios para el funcionamiento del programa
 * @author user
 *
 */
public class Logic {
	/**
	 * Atributo
	 */
	public static final String phrase = "Sogamoso ciudad del sol y del acero";

	/**
	 * Constructor de la clase
	 */
	public Logic() {

	}
	
	/**
	 * Método el cual la oracion final cambia a tener todas las primeras letras en
	 * mayuscula (nombre propio)
	 * 
	 * @param sentence
	 * @return characteres
	 */
	public String OwnName() {
		char[] characteres = phrase.toCharArray();
		characteres[0] = Character.toUpperCase(characteres[0]);
		for (int i = 0; i < characteres.length - 2; i++) {
			if (characteres[i] == ' ' || characteres[i] == '.' || characteres[i] == ',' || characteres[i] == 'y') {
				characteres[i + 1] = Character.toUpperCase(characteres[i + 1]);
			}
		}
		return new String(characteres);
	}
	 /**
	  *  En este método se busca una plabra en este caso es (del) Se pone un
	 *         espacio antes y depues de la plabra a buscar Ignorando las
	 *         mayuscuylas y minusculas retorna un entero con el numero de veces que
	 *             existe la cadena
	  * @param word
	  * @return cadena de strings
	  */
	public int SeachWord(String word) {
		int cont = 0;
		if (phrase.length() == word.length()) {
			if (phrase.equalsIgnoreCase(word)) {
				cont++;
			}
		} else if (phrase.length() < word.length()) {
			cont = 0;
		} else {
			for (int i = 0; i <= phrase.length() - word.length(); i++) {

				if (i == 0) {
					if (phrase.substring(i + word.length(), (i + word.length() + 1)).equalsIgnoreCase(" ")) {
						if (phrase.substring(i, i + word.length()).equalsIgnoreCase(word)) {
							cont++;
						}
					}
				} else if (i < phrase.length() - word.length()) {
					if (phrase.substring(i - 1, i).equalsIgnoreCase(" ")
							&& phrase.substring(i + word.length(), (i + word.length() + 1)).equalsIgnoreCase(" ")) {
						if (phrase.substring(i, i + word.length()).equalsIgnoreCase(word)) {
							cont++;
						}
					}
				} else {
					if (phrase.substring(i - 1, i).equalsIgnoreCase(" ")) {
						if (phrase.substring(i, i + word.length()).equalsIgnoreCase(word)) {
							cont++;
						}
					}
				}
			}
		}
		return cont;
	}

	/**
	 * Metodo en cual recibe una cadena y este encripta o cifra dicha cadena
	 * @return retorna un resultado de tipo string encriptada.
	 */
	public static String encryptedCode() {
		char encrypt[] = phrase.toCharArray();
		for (int i = 0; i < encrypt.length; i++) {
			encrypt[i] = (char) (encrypt[i] + (char) 56);
		}
		return String.valueOf(encrypt);

	}

	/**
	 * Método en el cual desencripta lo que fue encriptado en el método
	 * anterior
	 * @return cadena de strings desencriptada
	 */
	public static String decryptedCode() {
		char decrypted[] = encryptedCode().toCharArray();
		for (int i = 0; i < decrypted.length; i++) {
			decrypted[i] = (char) (decrypted[i] - (char) 56);
		}
		return String.valueOf(decrypted);

	}


	/**
	 *  Metodo llenar caracteres de un frase
	 * @param character
	 * @param number
	 * @param direction
	 * @return frase mas los caracteres que se le agregaron
	 */
	 public String fillchars(char character, int number, String direction){
	        String chars ="";
	        String auxiliar="";
	        for (int i =0;i<number;i++){
	            chars+=character;
	        }
	        if (direction.equalsIgnoreCase("Derecha")){
	            auxiliar= phrase +chars;

	        }else {
	            auxiliar=chars+phrase;
	        }
	        return auxiliar;
	    }
	 
	 /**
	  * metodo que permite borrar un caracter en esepcifico de la frase
	  * @param Char
	  * @return frase sin el caracter seleccionado
	  */
	 public String DeleteChar(String Char) {
	        String Removedchar = "";
	        for (int i = 0; i < phrase.length(); i++) {
	            String auxiliar = Character.toString(phrase.charAt(i));
	            if (!Char.contains(auxiliar)) {
	                Removedchar += auxiliar.toLowerCase();
	            }
	        }
	        return Removedchar;
	    }
	 
	 /**
	  * metodo que permite hacer iunterseccion auna cadena de caracteres
	  * @param input
	  * @return palabra interesctada
	  */
	 public String intersection(String input) {

	        String intersec = "";
	        for (int i = 0; i < input.length(); i++) {
	            String auxiliar = Character.toString(input.charAt(i));
	            if (phrase.contains(auxiliar)) {
	                if (!intersec.contains(auxiliar)) {
	                    intersec += auxiliar;
	                }
	            }
	        }
	        return intersec;
	    }
	 
	 /**
	  *  metodo que permite hallar las diferencias entre una cadena original y una cadena de entrada
	  * @param input
	  * @return diferencias entre las cadenas
	  */
	 public String diference(String input) {
			String duplicate = "";
			for (int i = 0; i < phrase.length(); i++) {
				String si = Character.toString(phrase.charAt(i));
				if (!input.contains(si)) {
					duplicate += si;
				}
			}
			return duplicate;
		}
	 /**
	  * Este método observa si la palabra se encuentra o no
	  * @param character
	  * @param string
	  * @return boolean true o false
	  */
	 public static boolean frecuence(String character, String string) {
			int counter = 0;
			for (int i = 0; i < string.length(); i++) {
				if (string.substring(i, i + 1).equalsIgnoreCase(character)) {
					counter++;
				}
			}
			if (counter == 0)
				return false;
			else
				return true;
		}

	 /**
		 * @param text: hace referencia a el texto ingreasado por el usuario
		 * @param rightOrLeft: si desea borrar por derecha o izquierda
		 * @return Borra a la izquierda o a la derecha de la cadena los caracteres que
		 *         existen en la cadena de entrada, hasta que encyentre un caracter que
		 *         no exista
		 */
	 public String deletecharacter(String text, String rightOrLeft) {

			if (rightOrLeft.equals("Izquierda")) {
				String finalText = phrase;
				for (int i = 0; i < phrase.length(); i++) {
					if (frecuence(phrase.substring(i, i + 1), text)) {
						finalText = phrase.substring(i + 1, phrase.length());
					} else {
						return finalText;
					}

				}
				return finalText;
			} else {
				String finalText = phrase;
				for (int i = phrase.length(); i >= 0; i--) {
					if (frecuence(phrase.substring(i - 1, i), text)) {
						finalText = phrase.substring(0, i - 1);
					} else {
						return finalText;
					}

				}
				return finalText;
			}
		}
	 
	 

	
}
