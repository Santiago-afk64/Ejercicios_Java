import java.util.Scanner;

public class DescuentoComercio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Categoría (1-4): ");
        int categoria = sc.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();
        double descuento = 0.0;
        switch (categoria) {
        case 1: 
            if (cantidad >= 10) {
                descuento = 0.05;
            }
            break;
        case 2: 
            if (cantidad >= 5) {
                descuento = 0.10;
            }
            break;
        case 3: 
            descuento = 0.03; 
            break;
        case 4: 
            descuento = 0.0; 
            break;
         default: System.out.println("Categoría inválida");
    }
        double total = precio * cantidad * (1 - descuento);
    if (total > 100) { 
        total *= 0.98;
    }
    System.out.println("Total a pagar: $" + total);
    sc.close();
    }
    
}
