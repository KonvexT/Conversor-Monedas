import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        int opcionMenu = 0;
        double monto = 0;

        while (opcionMenu != 7) {
            System.out.println("\n");
            System.out.println("*******************************************");
            System.out.println("*** Bienvenido al Conversor de monedas! ***");
            System.out.println("1. Peso Chileno (CLP) a Dólar (USD)");
            System.out.println("2. Dólar (USD) a Peso Chileno (CLP)");
            System.out.println("3. Peso Chileno (CLP) a Real Brasileño (BRL)");
            System.out.println("4. Real Brasileño (BRL) a Peso Chileno (CLP)");
            System.out.println("5. Peso Chileno (CLP) a Peso Argentino (ARS)");
            System.out.println("6. Peso Argentino (ARS) a Peso Chileno (CLP) ");
            System.out.println("7. Salir");
            System.out.println("Ingrese una opción válida: ");

            try {
                opcionMenu = teclado.nextInt();
                teclado.nextLine();

                if (opcionMenu <1 || opcionMenu >7) {
                    System.out.println("Error. Debes ingresar una opción entre 1 y 7!");

                }
            } catch (InputMismatchException e) {
                System.out.println("Error! debes ingresar solo números dentro de las opciones válidas");
                teclado.nextLine();
                continue;
            }

            switch (opcionMenu) {
                case 1:
                    System.out.println("Ingrese el monto en Pesos Chilenos (CLP) a convertir: ");
                    monto = teclado.nextDouble();
                    teclado.nextLine();

                    try {
                        Conversion conversion1 = consulta.obtenerConversion("CLP", "USD", monto);
                        System.out.println("El monto " + monto + " CLP equivale a: "
                                + conversion1.conversion_result() + " USD");
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Error de conexión con la API: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el monto en Dólares (USD) a convertir: ");
                    monto = teclado.nextDouble();
                    teclado.nextLine();

                    try {
                        Conversion conversion2 = consulta.obtenerConversion("USD", "CLP", monto);
                        System.out.println("El monto " + monto + " USD equivale a: "
                                + conversion2.conversion_result() + " CLP");
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Error de conexión con la API: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto en Pesos Chilenos (CLP) a convertir: ");
                    monto = teclado.nextDouble();
                    teclado.nextLine();

                    try {
                        Conversion conversion3 = consulta.obtenerConversion("CLP", "BRL", monto);
                        System.out.println("El monto " + monto + " CLP equivale a: "
                                + conversion3.conversion_result() + " BRL");
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Error de conexión con la API: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el monto en Reales Brasileños (BRL) a convertir: ");
                    monto = teclado.nextDouble();
                    teclado.nextLine();

                    try {
                        Conversion conversion3 = consulta.obtenerConversion("BRL", "CLP", monto);
                        System.out.println("El monto " + monto + " BRL equivale a: "
                                + conversion3.conversion_result() + " CLP");
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Error de conexión con la API: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el monto en Pesos Chilenos (CLP) a convertir: ");
                    monto = teclado.nextDouble();
                    teclado.nextLine();

                    try {
                        Conversion conversion5 = consulta.obtenerConversion("CLP", "ARS", monto);
                        System.out.println("El monto " + monto + " CLP equivale a: "
                                + conversion5.conversion_result() + " ARS");
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Error de conexión con la API: " + e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el monto en Pesos Argentinos (ARS) a convertir: ");
                    monto = teclado.nextDouble();
                    teclado.nextLine();

                    try {
                        Conversion conversion6 = consulta.obtenerConversion("ARS", "CLP", monto);
                        System.out.println("El monto " + monto + " ARS equivale a: "
                                + conversion6.conversion_result() + " CLP");
                    } catch (IOException | InterruptedException e) {
                        System.out.println("Error de conexión con la API: " + e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Gracias por usar el conversor de monedas!");
                    break;

                default:
                    System.out.println("Error! opción no válida");
                    break;
            } // Cierra el switch.
        } // Cierra el while.
    } // Cierra el metodo main.
} // Cierra la clase Principal.