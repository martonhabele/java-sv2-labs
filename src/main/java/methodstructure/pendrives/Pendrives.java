package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> pendriveList) {
        Pendrive minimum = pendriveList.get(0);
        for (int i = 0; i < pendriveList.size(); i++) {
            if (minimum.comparePricePerCapacity(pendriveList.get(i)) == 1) {
                minimum = pendriveList.get(i);
            }
        }
        return minimum;
    }

    public Pendrive getCheapest(List<Pendrive> pendriveList) {
        Pendrive cheapest = pendriveList.get(0);
        for (int i = 0; i < pendriveList.size(); i++) {
            if (pendriveList.get(i).isCheaperThan(cheapest)) {
                cheapest = pendriveList.get(i);
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendriveList, int percent, int capacity) {
        for (Pendrive pendrive : pendriveList) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }
}