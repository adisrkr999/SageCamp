import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TEstProject {
    public static void main(String[] args) {
        System.out.println(new Date(System.currentTimeMillis()));

        String pattern = "HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);
        Date today = Calendar.getInstance().getTime();
        String todayAsString = df.format(today);
        String key = " at " + todayAsString;


        System.out.println(" at " + todayAsString);

        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();


        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);

        LinkedHashMap<String, String> lhm
                = new LinkedHashMap<String, String>();

        // Adding entries in Map
        // using put() method
        lhm.put("zao223 at 16:42:26", "yk");
        lhm.put("zao223 at 16:42:12", "hghn");
        lhm.put("rr3434 at 16:54:45", "buj");

        // Printing all entries inside Map
        System.out.println(lhm+ " \nand size is : "+lhm.size());
    }

//    public getTimesAgo()


}
