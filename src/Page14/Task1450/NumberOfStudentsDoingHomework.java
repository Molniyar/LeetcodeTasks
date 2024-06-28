package Page14.Task1450;

public class NumberOfStudentsDoingHomework {
    public static void main(String[] args) {
        int[] startTiime = {1,2,3};
        int[] endTime = {3,2,7};
        System.out.println(new NumberOfStudentsDoingHomework().busyStudent(startTiime, endTime, 3));
    }
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for (int i = 0; i < startTime.length; i++){
            if (queryTime >= startTime[i] && queryTime <= endTime[i]){
                result++;
            }
        }
        return result;
    }
}
