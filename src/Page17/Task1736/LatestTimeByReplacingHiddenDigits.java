package Page17.Task1736;

public class LatestTimeByReplacingHiddenDigits {
    public static void main(String[] args) {

    }
    public String maximumTime(String time) {
        char[] res = time.toCharArray();
        if (res[0] == '?'){
            if (res[1] == '?'){
                res[0] = '2';
                res[1] = '3';
            }
            else {
                if (res[1] < '4'){
                    res[0] = '2';
                }
                else res[0] = '1';
            }
        }
        else if (res[1] == '?'){
            if (res[0] < '2'){
                res[1] = '9';
            }
            else res[1] = '3';
        }
        if (res[3] == '?'){
            res[3] = '5';
        }
        if (res[4] == '?'){
            res[4] = '9';
        }
        return new String(res);
    }
}
