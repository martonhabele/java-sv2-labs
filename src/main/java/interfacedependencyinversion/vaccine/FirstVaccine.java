package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addPregnantsToVaccinationList(registrated);
        addEldersToVaccinationList(registrated);
        addOthersToVaccinationList(registrated);
    }

    private void addPregnantsToVaccinationList(List<Person> registrated) {
        for (Person person : registrated) {
            if (person.getPregnant() == Pregnancy.YES) {
                vaccinationList.add(person);
            }
        }
    }

    private void addEldersToVaccinationList(List<Person> registrated) {
        for (Person person : registrated) {
            if (person.getAge() > 65 && person.getPregnant() == Pregnancy.NO) {
                vaccinationList.add(person);
            }
        }
    }

    private void addOthersToVaccinationList(List<Person> registrated) {
        for (Person person : registrated) {
            if (person.getAge() <= 65 && person.getPregnant() == Pregnancy.NO) {
                vaccinationList.add(person);
            }
        }
    }
}