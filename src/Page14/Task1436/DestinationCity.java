package Page14.Task1436;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class DestinationCity {
    public static void main(String[] args) {

    }
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();

        for (List<String> keep : paths) {
            set.add(keep.get(0));
        }

        for (List<String> keep : paths) {
            if (!set.contains(keep.get(1))) {return keep.get(1);}
        }

        return "";
    }
}
