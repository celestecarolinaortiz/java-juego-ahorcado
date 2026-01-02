import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //Clase scanner para leer datos por consola
        Scanner newScanner = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglo para almacenar las letras adivinadas. Inicialmente se llena con guiones bajos por cada letra de la palabra secreta
        char[] letrasAdivinadas = new char[palabraSecreta.length()]; 
        
        //For para llenar el arreglo con guiones bajos
        for(int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        //Ciclo principal del juego
        //Mientras la palabra no haya sido adivinada y el número de intentos sea menor al máximo permitido sigue el juego
        while(!palabraAdivinada && intentos < intentosMaximos){
            //Inicialmente se mostrara la palabra cubierta por los guiones bajos y a medida que se 
            //vaya adivinando se irá rellenando el arreglo letrasAdivinadas
            System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Intentos restantes: " + (intentosMaximos - intentos));
            System.out.println("Introduce una letra por favor:");

            //Convierte en minúscula la letra ingresada por el usuario
            char letraIngresada = Character.toLowerCase(newScanner.next().charAt(0));

            //Variable para verificar si la letra ingresada es correcta
            boolean letraCorrecta = false;

            //Recorre la palabra secreta y compara si la letra ingresada es igual a alguna letra de la palabra secreta
            for(int i = 0; i < palabraSecreta.length(); i++) {
                
                if(palabraSecreta.charAt(i) == letraIngresada) {
                    //Si la letra es correcta, se asigna en el arreglo letrasAdivinadas en la posición correspondiente
                    letrasAdivinadas[i] = letraIngresada;

                    //Esto sirve para no perder un intento si la letra es correcta
                    letraCorrecta = true;
                }

            }

            //Si la letra que ingresó el usuario no es correcta, se incrementa el contador de intentos
            // y le notifica al usuario
            if(!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta. Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            //Compara si la palabra adivinada es igual a la palabra secreta
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);

            }
        }

        //Si el usuario no adivina la palabra y se queda sin intentos, le notifica que ha perdido
        if(!palabraAdivinada) {
            System.out.println("Lo siento, has perdido. La palabra era: " + palabraSecreta);
        }   


        //Cerrar el scanner 
        newScanner.close();
    }
}
