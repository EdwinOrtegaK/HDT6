import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner peko = new Scanner(System.in);
        int op = 0;
        while (op != 4){
            System.out.println("Tipos de Map");
            System.out.println("¿Cuál implementación Map quiere trabajar?");
            System.out.println("1. HashMap\n2. TreeMap\n3. LinkedHashMap\n 4. Salir");
            op = peko.nextInt();
            switch (op){
                case 1:
                    System.out.println("HashMap");
                    break;
                case 2:
                    System.out.println("TreeMap");
                    break;
                case 3:
                    System.out.println("LinkedHashMap");
                    break;
            }
        }
    }
}