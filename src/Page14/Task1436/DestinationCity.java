package Page14.Task1436;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class DestinationCity {
    public static void main(String[] args) {

    }
    public String destCity(List<List<String>> paths) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < paths.size(); i++){
            var keep = paths.get(i);
            map.put(keep.get(0), map.getOrDefault(keep.get(0), 0) + 1);
            map.put(keep.get(1), map.getOrDefault(keep.get(1), 0) - 1);
        }

        for(var cityDegPair : map.entrySet()){
            if(cityDegPair.getValue() == -1)return cityDegPair.getKey();
        }
        return "";
    }
}
