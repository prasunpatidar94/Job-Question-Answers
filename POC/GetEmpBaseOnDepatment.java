import java.util.*;
import java.util.stream.Collectors;

public class GetEmpBaseOnDepatment {

    public static void main(String[] args) {

        List<Empl> emps = new ArrayList<>();
        emps.add(new Empl(101, "Prasun", "dev", 106555.00));
        emps.add(new Empl(102, "Kamal", "pod", 15000.00));
        emps.add(new Empl(103, "Megha", "dev", 1555.0));
        emps.add(new Empl(104, "Rekha", "qa", 108555.0));
        emps.add(new Empl(105, "Chandan", "dev", 18555.0));
        emps.add(new Empl(106, "Om", "dev", 1985.0));
        emps.add(new Empl(107, "Ompal", "qa", 10655.0));
        emps.add(new Empl(108, "Vikash", "dev", 1555.0));
        emps.add(new Empl(109, "Goli", "pod", 1555.0));
        emps.add(new Empl(110, "Tapu", "dev", 1055.0));

        System.out.println(getEmpsBasedOnDept(emps));
    }

    private static Map<String, Object> getEmpsBasedOnDept(List<Empl> emps) {

        return emps.stream()
                .collect(
                        Collectors
                                .groupingBy(
                                        Empl::getDept,
                                        Collectors
                                                .collectingAndThen(
                                                        Collectors.maxBy(
                                                                Comparator
                                                                        .comparingDouble(
                                                                                Empl::getSalary
                                                                        )
                                                        )
                                                        ,
                                                        Optional::get
                                                )
                                )
                );









    }

}

class Empl {

    private Integer id;
    private String name;
    private String dept;
    private Double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Empl(Integer id, String name, String dept, Double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

}