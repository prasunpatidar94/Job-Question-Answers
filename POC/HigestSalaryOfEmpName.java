import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HigestSalaryOfEmpName {
    public static void main(String[] args) {

        List<worker> workers = Arrays.asList(
                new worker(101, "prasun", 10.50),
                new worker(102, "kamal", 12.50),
                new worker(103, "rekha", 15.50),
                new worker(104, "vikash", 17.50),
                new worker(105, "ram", 16.50),
                new worker(106, "kalu", 19.50),
                new worker(107, "megha", 22.50)
        );

        String name1 = workers.stream()
                .sorted(
                        (o1, o2) -> o1.getSalary().compareTo(o2.getSalary())
                )
                .skip(workers.size() - 1).map(e -> e.getName()).collect(Collectors.joining());

        String name2 = workers.stream()
                .max((o1, o2) -> o2.getSalary().compareTo(o1.getSalary())).get().getName();

        name2 = workers.stream()
                .sorted((o1, o2) -> o2.getSalary().compareTo(o1.getSalary()))
                .skip(1).collect(Collectors.toList()).get(0).getName();

        System.out.println("name 1  :" + name1);
        System.out.println("name 2  :" + name2);


        try{

            System.out.println("prasun try");
        }catch (Exception e){}
        finally {

        }



    }

}


class worker {

    private Integer id;
    private String name;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public worker(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}