import java.util.Scanner;

public class NivelAcadémico {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();
        System.out.print("Materias reprobadas: ");
        int repro = sc.nextInt();
        int nivel = 4;

        if (promedio >= 9 && repro == 0) {
            nivel = 1;
        }
        else if (promedio >= 8 && repro <= 1) {
            nivel = 2;
        }
        else if (promedio >= 7) {
            nivel = 3;
        }
        switch (nivel) {
        case 1: 
            System.out.println("Excelente - Continúa así"); 
            break;
        case 2: 
            System.out.println("Bueno - Refuerza debilidades"); 
            break;
        case 3: 
            System.out.println("Regular - Necesitas más estudio"); 
            break;
        case 4: 
            System.out.println("En riesgo - Busca tutoría"); 
            break;
        }
        sc.close();
    }
    
}
