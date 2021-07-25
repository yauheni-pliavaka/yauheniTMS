import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = initPersonList();
        PersonRegistry personRegistry = new PersonRegistry(personList);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        MilitaryOfficeService militaryOfficeService = new MilitaryOfficeServiceImpl(militaryOffice);
        System.out.println();

        System.out.println("NAMES OF RECRUITS:");
        for (Person person : militaryOfficeService.getSuitablePersons()) {
            System.out.println(person.getName());
        }
        System.out.println("COUNT OF RECRUITS FROM MINSK:");
        System.out.println(militaryOfficeService.getCountSuitablePersonsFromCity("Minsk"));
        System.out.println("COUNT OF RECRUITS 25-27:");
        System.out.println(militaryOfficeService.getCountSuitablePersonsByAge(25, 27));
        System.out.println("COUNT OF RECRUITS WITH NAME1:");
        System.out.println(militaryOfficeService.getCountSuitablePersonsByName("name1"));
    }

    public static ArrayList<Person> initPersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String randomCountry = Calculation.randomCountry();
            Address address = new Address(randomCountry, Calculation.randomCity(randomCountry));
            personList.add(new Person("name" + i, Calculation.randomAge(),
                    Calculation.randomSex(), address));
            System.out.println(personList.get(i));
        }
        return personList;
    }
}
