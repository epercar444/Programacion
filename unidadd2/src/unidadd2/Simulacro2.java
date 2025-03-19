package unidadd2;

import java.util.*;

public class Simulacro2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Simulacro2 simulacro = new Simulacro2();
        System.out.println("Introduce un número para redondear:");
        String numeroCadena = input.next();
        String resultado = simulacro.redondear(numeroCadena);
        System.out.println("Resultado redondeado: " + resultado);
        System.out.println("Introduce una lista de números separados por espacios:");
        input.nextLine();
        String[] numerosCadena = input.nextLine().split(" ");
        System.out.println("Número de decimales para redondear:");
        int decimales = input.nextInt();
        List<String> listaRedondeada = simulacro.redondearLista(Arrays.asList(numerosCadena), decimales);
        System.out.println("Lista redondeada: " + listaRedondeada);
        input.close();
    }

    String redondear(String numeroARedondear) {
        if (!esNumeroValido(numeroARedondear)) return "Error: Entrada no válida.";
        String[] partes = numeroARedondear.split("\\.");
        String parteEntera = partes[0];
        String parteDecimal = partes.length > 1 ? partes[1] : "";
        if (parteDecimal.length() > 2) {
            char tercerDecimal = parteDecimal.charAt(2);
            parteDecimal = parteDecimal.substring(0, 2);
            if (tercerDecimal >= '5') parteDecimal = incrementarDecimal(parteDecimal);
        }
        while (parteDecimal.length() < 2) parteDecimal += "0";
        return parteEntera + "." + parteDecimal;
    }

    List<String> redondearLista(List<String> numeros, int decimales) {
        List<String> resultado = new ArrayList<>();
        for (String numero : numeros) {
            if (esNumeroValido(numero)) resultado.add(redondearConDigitos(numero, decimales));
            else resultado.add("Error: '" + numero + "' no válido.");
        }
        return resultado;
    }

    String redondearConDigitos(String numeroARedondear, int digitos) {
        String[] partes = numeroARedondear.split("\\.");
        String parteEntera = partes[0];
        String parteDecimal = partes.length > 1 ? partes[1] : "";
        if (parteDecimal.length() > digitos) {
            char siguienteDecimal = parteDecimal.charAt(digitos);
            parteDecimal = parteDecimal.substring(0, digitos);
            if (siguienteDecimal >= '5') parteDecimal = incrementarDecimal(parteDecimal);
        }
        while (parteDecimal.length() < digitos) parteDecimal += "0";
        return parteEntera + "." + parteDecimal;
    }

    String incrementarDecimal(String numero) {
        StringBuilder sb = new StringBuilder(numero);
        int i = numero.length() - 1;
        while (i >= 0) {
            char c = sb.charAt(i);
            if (c == '9') {
                sb.setCharAt(i, '0');
                i--;
            } else {
                sb.setCharAt(i, (char) (c + 1));
                return sb.toString();
            }
        }
        return "1" + sb.toString();
    }

    boolean esNumeroValido(String numero) {
        return numero.matches("\\d+(\\.\\d+)?");
    }
}
