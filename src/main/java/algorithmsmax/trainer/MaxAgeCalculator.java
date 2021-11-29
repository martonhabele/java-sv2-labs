package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer trainer = trainers.get(0);
        for (Trainer scopedTrainer : trainers) {
            if (scopedTrainer.getAge() > trainer.getAge()) {
                trainer = scopedTrainer;
            }
        }
        return trainer;
    }
}