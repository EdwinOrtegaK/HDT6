import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner peko = new Scanner(System.in);
        int op = 0;
        while (op != 4){
            System.out.println("\nTipos de Map");
            System.out.println("¿Cuál implementación Map quiere trabajar?");
            System.out.println("1. HashMap\n2. TreeMap\n3. LinkedHashMap\n4. Salir");
            op = peko.nextInt();
            Map<String, ArrayList> Inventario = FactoryMap.getInstance(op);
            Read.leer();
        }
    }
}