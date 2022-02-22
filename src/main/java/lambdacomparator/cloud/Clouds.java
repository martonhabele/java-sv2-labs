package lambdacomparator.cloud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clouds {
    public CloudStorage alphabeticallyFirst(List<CloudStorage> storages) {
        return Collections.min(storages, Comparator.comparing(CloudStorage::getProvider, String::compareToIgnoreCase));
    }

    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> storages) {
        return Collections.min(storages, Comparator.comparing(CloudStorage::getPayPeriod, Comparator.nullsFirst(
                Comparator.comparingInt(PayPeriod::getLength)))
                .thenComparingDouble(CloudStorage::getPrice));
    }

    public List<CloudStorage> worstOffers(List<CloudStorage> storages) {
        List<CloudStorage> copiedStorages = new ArrayList<>(storages);
        copiedStorages.sort(Comparator.reverseOrder());
        return copiedStorages.subList(0, Math.min(copiedStorages.size(), 3));
    }
}