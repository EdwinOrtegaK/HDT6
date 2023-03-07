import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<String, ArrayList<String>> InventarioMap;
    public static Map<String, ArrayList<String>> ColeccionMap;
    public static void main(String[] args) {
        Scanner peko = new Scanner(System.in);
        Controler cc = new Controler();
        int op = 0;
        while (op != 8){
            op = Controler.Menu();
            switch (op){
                case 1:
                    ColeccionMap = cc.AgregarProd(InventarioMap, ColeccionMap);
                    break;
                case 2:
                    String key = cc.MostrarCat(InventarioMap);
                    if(key!=""){
                        System.out.println("La categoría es: "+key);
                    } else{
                        System.out.println("El producto se ha encontrado");
                    }
                    System.out.println("");
                    break;
                case 3:
                    cc.MostrarInvent(ColeccionMap);
                    break;
                case 4:
                    cc.MostrarInventOrd(ColeccionMap);
                    break;
                case 5:
                    cc.MostrarInvent(InventarioMap);
                    break;
                case 6:
                    cc.MostrarInventOrd(InventarioMap);
                    break;
                case 7:
                    cc.MostrarInvent(ColeccionMap);
                    break;
            }
        }
        Map<String, ArrayList<String>> Inventario = FactoryMap.getInstance(op);
        Inventario = Read.leer(Inventario);
    }
}