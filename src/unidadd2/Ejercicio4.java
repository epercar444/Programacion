package unidadd2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario = "admin";
        String contraseña = "secreta123";
        System.out.print("Introduce el usuario: ");
        String usu = scanner.nextLine();
        System.out.print("Introduce la contraseña: ");
        String contra = scanner.nextLine();
        if (usuario.equals(usu) && contraseña.equals(contra)) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
