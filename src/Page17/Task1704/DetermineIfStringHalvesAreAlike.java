package Page17.Task1704;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {

    }
    public boolean halvesAreAlike(String s) {
        int c1 = 0;
        int c2 = 0;

        for (int i = 0, j = s.length()/2;j < s.length();i++, j++){
            switch (s.charAt(i)){
                case 'a','e','i','o','u','A','E','I','O','U' -> c1++;
            }
            switch (s.charAt(j)){
                case 'a','e','i','o','u','A','E','I','O','U' -> c2++;
            }
        }
        return c1 == c2;
    }
}
