import jdk.jfr.Category;

import java.util.*;

public class Controler {
    static Scanner peko = new Scanner(System.in);

    public static int Menu(){
        int res = 0;
            System.out.println("¿Qué es lo que desea hacer?");
            System.out.println("1. Agregar Producto\n2. Mostrar categoria de un producto\n3. Mostrar productos comprados\n4. Mostrar productos comrpados ordenados\n5. Mostrar inventario\n6. Mostrar inventario ordenado\n7. Salir");
            res = peko.nextInt();
        return res;
    }

    public int MenuMap(){
        int res = 0;
            System.out.println("\nTipos de Map");
            System.out.println("¿Cuál implementación Map quiere trabajar?");
            System.out.println("1. HashMap\n2. TreeMap\n3. LinkedHashMap\n4. Salir");
            res = peko.nextInt();
        return res;
    }

    public String MenuCat(){
        String res = "";
        System.out.println("\nIngrese la categoria del producto");
        System.out.println("1. Mueble de terraza\n2. Sillones de masaje\n3. Bebidas\n4. Condimentos\n5. Frutas\n6. Carnes\n7. Lacteos\n8. Salir");
        res = peko.next();
        return res;
    }

    public String MenuProd(ArrayList<String> inventario){
        System.out.println("Ingrese el producto que desea encontrar");
        for (int i = 0; i<inventario.size(); i++){
            System.out.println(i+1+" "+inventario.get(i));
        }
        return peko.nextLine();
    }

    public String getProd(){
        System.out.println("Ingrese el producto:");
        return peko.nextLine();
    }

    public Map<String, ArrayList<String>> AgregarProd(Map<String, ArrayList<String>> MapInventario, Map<String, ArrayList<String>> MapCarrito){
        try {
            String categoria = MenuCat();
            if (Main.InventarioMap.containsKey(categoria)){
                String prod = MenuProd(Main.InventarioMap.get(categoria));
                if(Main.InventarioMap.get(categoria).contains(prod)){
                    if(Main.ColeccionMap.containsKey(categoria)){
                        Main.ColeccionMap.get(categoria).add(prod);
                    } else{
                        ArrayList<String> temp = new ArrayList<String>();
                        temp.add(prod);
                        Main.ColeccionMap.put(categoria,temp);
                    }
                    System.out.println("Producto agregado correctamente");
                } else{
                    System.out.println("Producto no existe");
                }
            } else{
                System.out.println("Categoria no existe");
            }
        } catch(Exception e){}
        return MapInventario;
    }

    public String MostrarCat(Map<String, ArrayList<String>> mapInventario) {
        String prod = getProd();
        String categ = "";
        for (String key : Main.InventarioMap.keySet()) {
            if (Main.InventarioMap.get(key).contains(prod)) {
                categ = key;
            }
        }
        return categ;
    }

    public void MostrarInvent(Map<String, ArrayList<String>> InventarioMap){
        String[] keysArray = Main.InventarioMap.keySet().toArray(new String[Main.InventarioMap.size()]);
        ArrayList<String> KeysOrdered = new ArrayList<String>(Arrays.asList(keysArray));
        for(int i = 0; i < KeysOrdered.size(); i++){
            System.out.println((i+1)+". "+KeysOrdered.get(i)+": "+Main.InventarioMap.get(KeysOrdered.get(i)));
        }
        System.out.println("");
    }

    public void MostrarInventOrd(Map<String, ArrayList<String>> InventarioMap){
        String[] keysArray = Main.InventarioMap.keySet().toArray(new String[Main.InventarioMap.size()]);
        ArrayList<String> KeysOrdered = new ArrayList<String>(Arrays.asList(keysArray));
        Collections.sort(KeysOrdered);
        for(int i = 0; i < KeysOrdered.size(); i++){
            System.out.println((i+1)+". "+KeysOrdered.get(i)+": "+Main.InventarioMap.get(KeysOrdered.get(i)));
        }
        System.out.println("");
    }

}
