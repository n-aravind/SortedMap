import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> myMap = new TreeMap<Integer, Integer>();

        for(int i = 1; i < 11; i++){
            myMap.put((int)(Math.random()*100),i);
        }

        for(Map.Entry<Integer,Integer> map: myMap.entrySet()){
            System.out.println(map.getKey()+" : "+map.getValue());
        }
    }
}
