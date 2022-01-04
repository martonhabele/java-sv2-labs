package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addEldersToVaccinationList(registrated);
        addYoungPeopleToVaccinationList(registrated);
    }

    private void addYoungPeopleToVaccinationList(List<Person> registrated) {
        for (Person person : registrated) {
            if (person.getAge() <= 65 && person.getPregnant() == Pregnancy.NO && person.getChronic() == ChronicDisease.NO) {
                vaccinationList.add(person);
            }
        }
    }

    private void addEldersToVaccinationList(List<Person> registrated) {
        for (Person person : registrated) {
            if (person.getAge() > 65 && person.getPregnant() == Pregnancy.NO && person.getChronic() == ChronicDisease.NO) {
                vaccinationList.add(person);
            }
        }
    }
}