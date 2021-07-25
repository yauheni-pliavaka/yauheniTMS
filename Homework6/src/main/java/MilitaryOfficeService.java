import java.util.List;

public interface MilitaryOfficeService {
    List<Person> getSuitablePersons();

    int getCountSuitablePersonsFromCity(String city);

    int getCountSuitablePersonsByAge(int a, int b);

    int getCountSuitablePersonsByName(String name);
}
