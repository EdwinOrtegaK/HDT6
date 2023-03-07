import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FactoryMap {
    public static Map getInstance(int TipoDeMapa){
        switch (TipoDeMapa){
            case 1:
                System.out.println("HashMap");
                return new HashMap();
            case 2:
                System.out.println("TreeMap");
                return new TreeMap();
            case 3:
                System.out.println("LinkedHashMap");
                return new LinkedHashMap();
            case 4:
                System.out.println("Eso fue todo...");
        }
        return null;
    }
}