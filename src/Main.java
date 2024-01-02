import com.sun.jdi.ThreadReference;

import javax.swing.text.Element;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {


    /*
     *
     * Wann benutze ich: Eine Liste anstelle eines Sets (in Java)?
     *
     *
     * wo ist der unterschied:
     * set -> nicht sortiert, liste -> ist sortiert (schlüssel / wertpaare bei map)
     * liste -> kann doppelte elemente enthalten, set -> nicht
     * set -> schneller als liste (hashing)
     *
     *
     *
     * */

    
    /*Container und Sets:


 das eine Map verwendet, fertig 
 um zu zählen, 
wie oft jedes Wort 
in einer eingegebenen konsoleneingabe vorkommt. 
Nutze ein Set 
um alle eindeutigen Wörter zu speichern
 und gib diese sortiert
  aus.*/


    public static void main(String[] args) throws IOException {

        var map = new HashMap<String, Integer>();

        var reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        while (!(line = reader.readLine()).equalsIgnoreCase("end")) {
            var woerter = Arrays.stream(line.split(" ")).map(String::toLowerCase).toList();
            for (var wort : woerter) {
                if (map.containsKey(wort)) {
                    map.put(wort, map.get(wort) + 1);
                } else {
                    map.put(wort, 1);
                }
            }
        }
        
        //readin a line make it lowercase split it an than count the amount of how often a word appears in that line and save that info into a hasmap of (string, integer)

        for (var items : map.entrySet()) {
            System.out.println(items.getKey() + " kommt: " + items.getValue() + " oft vor");
        }
    }


}
