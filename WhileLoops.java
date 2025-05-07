import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber

        int random1 = 0;
        while (random1 != 7) {
            random1 = getRandomNumber(10);
            System.out.println("Número generado: " + random1);
        }

        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber

        int random2 = 0;
        while (random2 <= 70) {
            random2 = getRandomNumber(100);
            System.out.println("Número generado: " + random2);
        }

        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber

        int targetNumber = getRandomNumber(100);
        int guessNumber;

        System.out.println("Adivina el número entre 1 y 100: ");

        do {
            System.out.print("Tu número: ");
            guessNumber = scanner.nextInt();

            if (guessNumber < targetNumber) {
                System.out.println("Tu número es demasiado bajo.");
            } else if (guessNumber > targetNumber) {
                System.out.println("Tu número es demasiado alto.");
            }

        } while (guessNumber != targetNumber);

        System.out.println("¡Correcto! El número era: " + targetNumber);

        scanner.close();
    }


    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}

