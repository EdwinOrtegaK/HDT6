import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void leer(){
        try {
            File archivo = new File("ListadoProducto.txt");
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}