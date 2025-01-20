import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;
        Double valorAConvertir;

        System.out.println("*****************************************");
        System.out.println("\nBienvenido al conversor de monedas: ");
        String menu = """
                1.Sol => Dólar
                2.Dólar => Sol
                3.Sol => Euro
                4.Euro => Sol
                5.Dólar => Euro
                6.Euro => Dólar
                7.Sol => Peso Argentino
                8.Peso Argentino => sol
                9.Peso Argentino => Dólar
                10.Dólar => Peso Argentino
                11.Peso Argentino => Euro
                12.Euro => Peso Argentino
                13.Salir
                """;


        while (opcion != 13) {
            System.out.println("\n");
            System.out.println(menu);
            System.out.println("\nSeleciona la opción que prefieras: ");
            opcion = lectura.nextInt();


            String base_code = null;
            String target_code = null;


            switch (opcion) {
                case 1:
                    base_code = "PEN";
                    target_code = "USD";
                    System.out.println("Sol a Dólar");
                    break;
                case 2:
                    base_code = "USD";
                    target_code = "PEN";
                    System.out.println("Dólar a Sol");
                    break;
                case 3:
                    base_code = "PEN";
                    target_code = "EUR";
                    System.out.println("Sol a Euro");
                    break;
                case 4:
                    base_code = "EUR";
                    target_code = "PEN";
                    System.out.println("Euro a Dólar");
                    break;
                case 5:
                    base_code = "USD";
                    target_code = "EUR";
                    System.out.println("Dólar a Euro");
                    break;
                case 6:
                    base_code = "EUR";
                    target_code = "USD";
                    System.out.println("Euro a Dólar");
                    break;
                case 7:
                    base_code = "PEN";
                    target_code = "ARS";
                    System.out.println("Sol a Peso Argentino");
                    break;
                case 8:
                    base_code = "ARS";
                    target_code = "PEN";
                    System.out.println("Peso Argentino a Sol");
                    break;
                case 9:
                    base_code = "ARS";
                    target_code = "USD";
                    System.out.println("Peso Argentino a Dólar");
                    break;
                case 10:
                    base_code = "USD";
                    target_code = "ARS";
                    System.out.println("Dólar a Peso Argentino");
                    break;
                case 11:
                    base_code = "ARS";
                    target_code = "EUR";
                    System.out.println("Peso Argentino a Euro");
                    break;
                case 12:
                    base_code = "EUR";
                    target_code = "ARS";
                    System.out.println("Euro a Peso Argentino");
                    break;

                case 13:
                    System.out.println("Saliendo de la aplicación...");
                    continue;
                default:
                    System.out.println("Opción inválida. Intente de nuevo. \n");
                    continue;

            }

            System.out.println("Ingresa el valor a convertir: ");
            valorAConvertir = lectura.nextDouble();

            try {

                double conversionRate = consulta.buscaMoneda(base_code, target_code);
                System.out.println("La tasa de cambio de " + base_code + " a " + target_code + " es: " + conversionRate);

                double valorFinal = valorAConvertir * conversionRate;
                System.out.println("El valor que obtendras es: " + valorFinal +" " + target_code);

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("finalizando aplicación");
            }

        }

        lectura.close();
    }
}







