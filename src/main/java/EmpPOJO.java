import com.fasterxml.jackson.annotation.JsonAlias;

public class EmpPOJO {

    public String name;
    public int age;
    public int salary;

    public EmpPOJO(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
