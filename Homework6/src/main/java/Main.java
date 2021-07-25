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
        System.out.println("COUNT OF RECRUITS WITH NAME ALEX:");
        System.out.println(militaryOfficeService.getCountSuitablePersonsByName("Alex"));
    }

    public static ArrayList<Person> initPersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            String randomCountry = Calculation.randomCountry();
            Sex sex = Calculation.randomSex();
            Address address = new Address(randomCountry, Calculation.randomCity(randomCountry));
            personList.add(new Person(Calculation.randomName(sex), Calculation.randomAge(),
                    sex, address));
            System.out.println(personList.get(i));
        }
        return personList;
    }
}
