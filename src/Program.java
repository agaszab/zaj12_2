import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Set<String> imiona=new HashSet<>();
        imiona.add("Franek");
        imiona.add("Ola");
        imiona.add("Ala");
        imiona.add("Janek");
        imiona.add("Maciek");

        Iterator<String> iterator = imiona.iterator();
        while (iterator.hasNext() ) {
            String imie = iterator.next();
            System.out.println(imie);
        }

    }
}
