package Page16.Task1603;

public class ParkingSystem {
    int[] slots = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        slots[2] = small;
        slots[1] = medium;
        slots[0] = big;

    }
    public boolean addCar(int carType) {
        if (slots[carType - 1] > 0){
            slots[carType - 1]--;
            return true;
        }
        return false;
    }
}
