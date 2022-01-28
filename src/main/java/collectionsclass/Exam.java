package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {
    private List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> sorted = new ArrayList<>(examResults);
        if (places > sorted.size()) {
            places = sorted.size();
        }
        Collections.sort(sorted, new Comparator<ExamResult>() {
            @Override
            public int compare(ExamResult o1, ExamResult o2) {
                return Integer.valueOf(o1.getPoints()).compareTo(o2.getPoints());
            }
        });
        Collections.reverse(sorted);
        return getNames(sorted, places);
    }

    private List<String> getNames(List<ExamResult> sorted, int places) {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < places; i++) {
            names.add(sorted.get(i).getName());
        }
        return names;
    }

    public List<ExamResult> getExamResults() {
        return new ArrayList<>(examResults);
    }
}