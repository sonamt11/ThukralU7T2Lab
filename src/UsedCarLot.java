import java.util.ArrayList;

public class UsedCarLot {

    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(inventory.size(), car);
    }

    public boolean swap(int idx1, int idx2) {
        if (idx1 >= inventory.size() || idx2 >= inventory.size()) {
            return false;
        }
        Car car1 = inventory.get(idx1);
        Car car2 = inventory.get(idx2);
        inventory.set(idx1, car2);
        inventory.set(idx2, car1);
        return true;
    }

    public void addCar(int indexToAdd, Car carToAdd) {
        inventory.add(indexToAdd, carToAdd);
    }

    public Car sellCarShift(int indexOfCarToSell) {
        Car removed = inventory.remove(indexOfCarToSell);
        return removed;
    }

    public Car sellCarNoShift(int indexOfCarToSell) {
        Car removed = inventory.remove(indexOfCarToSell);
        inventory.add(indexOfCarToSell, null);
        return removed;
    }

    public void moveCar(int indexOfCarToMove, int destinationIndex) {
        Car carToMove = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, carToMove);
    }


}
