package Page14.Task1436;

import java.util.List;
import java.util.Objects;

public class DestinationCity {
    public static void main(String[] args) {

    }
    public String destCity(List<List<String>> paths) {
        String s = paths.get(0).get(0);
        for (int j = 0; j < paths.size(); j++){
            if (Objects.equals(paths.get(j).get(0), s)){
                s = paths.get(j).get(1);
                j = 0;
            }
        }
        return s;
    }
}
