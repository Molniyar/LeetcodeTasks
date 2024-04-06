package Page26.Task2652;

public class SumMultiples {
    public static void main(String[] args) {
        System.out.println(new SumMultiples().sumOfMultiples(7));
    }
    public int sumOfMultiples(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                result += i;
            }
        }
        return result;
    }
}
