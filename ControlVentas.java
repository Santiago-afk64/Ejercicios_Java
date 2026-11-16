import java.util.Scanner;

public class ControlVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la venta del día (-1 para terminar): ");
        double venta = sc.nextDouble();
        double total = 0, promedio, ventaMax = 0;
        int dias = 0, diasMayores500 = 0, diaMax = 0;

        while (venta != -1) {
            dias = dias ++;
            total= total += venta;

            if (venta > 500) {
                diasMayores500 = diasMayores500 ++;
            }

            if (dias == 1 || venta > ventaMax) {
                ventaMax = venta;
                diaMax = dias;
            }

            System.out.print("Ingrese la venta del día (-1 para terminar): ");
            venta = sc.nextDouble();
        }

        if (dias > 0) {
            promedio = total / dias;

            System.out.printf("Total de ventas: $%.2f%n", total);
            System.out.printf("Promedio de ventas: $%.2f%n", promedio);
            System.out.println("Días con ventas superiores a $500: " + diasMayores500);
            System.out.printf("Venta máxima: $%.2f%n", ventaMax);
            System.out.println("Día de la venta máxima: " + diaMax);
        } else {
            System.out.println("No se ingresaron ventas.");
        }

        sc.close();
    }
    
}
