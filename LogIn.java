import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar' mientras el nombre de usuario o la contraseña sean incorrectos.
        //Cuando el usuario y la constraseña sean correctos imprime en terminal: ¡Acceso concedido!

        //String correctUsername = "Pepita";
        //String correctPassword = "pepi123";

        Scanner scanner = new Scanner(System.in);

        final String correctUsername = "Pepita";
        final String correctPassword = "pepi123";

        String inputUsername;
        String inputPassword;

        do {
            System.out.print("Nombre de usuario: ");
            inputUsername = scanner.nextLine();

            System.out.print("Contraseña: ");
            inputPassword = scanner.nextLine();

            if (!inputUsername.equals(correctUsername) || !inputPassword.equals(correctPassword)) {
                System.out.println("Datos incorrectos, por favor vuelve a intentar.\n");
            }

        } while (!inputUsername.equals(correctUsername) || !inputPassword.equals(correctPassword));

        System.out.println("¡Acceso concedido!");

        scanner.close();

    }
}
