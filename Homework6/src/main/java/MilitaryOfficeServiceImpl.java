import lombok.AllArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
public class MilitaryOfficeServiceImpl implements MilitaryOfficeService {
    private final MilitaryOffice militaryOffice;

    @Override
    public ArrayList<Person> getSuitablePersons() {
        PersonRegistry personRegistry = militaryOffice.getPersonRegistry();
        ArrayList<Person> personList = personRegistry.getPersonList();
        ArrayList<Person> suitablePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() >= Constants.MIN_AGE && person.getAge() < Constants.MAX_AGE && Sex.MALE == person.getSex()) {
                suitablePersons.add(person);
            }
        }
        return suitablePersons;
    }

    @Override
    public int getCountSuitablePersonsFromCity(String city) {
        int count = 0;
        for (Person person : getSuitablePersons()) {
            if (city.equals(person.getAddress().getCity())) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int getCountSuitablePersonsByAge(int a, int b) {
        int count = 0;
        for (Person person : getSuitablePersons()) {
            if (person.getAge() >= a && person.getAge() <= b) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int getCountSuitablePersonsByName(String name) {
        int count = 0;
        for (Person person : getSuitablePersons()) {
            if (name.equals(person.getName())) {
                count++;
            }
        }
        return count;
    }
}
