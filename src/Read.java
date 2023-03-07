import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Read {
    public static Map<String, ArrayList<String>> leer(Map<String, ArrayList<String>> inventario){
        try {
            File archivo = new File("ListadoProducto.txt");
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            String linea;
            while ((linea = buffer.readLine()) != null) {
                String[] Listacategoria = linea.split("\\|");
                if(inventario.containsKey(Listacategoria[0])){
                    inventario.get(Listacategoria[0]).add(Listacategoria[1]);
                } else {
                    System.out.println(Listacategoria[0]);
                    ArrayList<String> items = new ArrayList<String>();
                    items.add(Listacategoria[1]);
                    inventario.put(Listacategoria[0], items);
                }
                //System.out.println(linea);
                //System.out.println(Listacategoría[0]); //Key
                //System.out.println(Listacategoría[1]); //Value
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}