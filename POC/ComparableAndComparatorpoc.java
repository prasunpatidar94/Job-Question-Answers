import java.util.*;

public class ComparableAndComparatorpoc {
    public static void main(String[] args) {


        List<Emps> emps = new ArrayList<>();

        emps.add(new Emps(20, "Prasun", "205050"));
        emps.add(new Emps(30, "Kamal", "205034550"));
        emps.add(new Emps(100, "Rekha", "205786783050"));
        emps.add(new Emps(60, "Mahesh", "205778050"));
        emps.add(new Emps(80, "Megha", "205033850"));
        emps.add(new Emps(50, "Vikash", "205033350"));
        emps.add(new Emps(90, "Om", "2098665050"));
        System.out.println("EMP before sort :: " + emps);
        Collections.sort(emps);
//        System.out.println("EMP sort with comparable of obj1.compareTo(obj2) :: " + emps);

//        Comparator<Emps> comparator = new Comparator<Emps>() {
//            @Override
//            public int compare(Emps o1, Emps o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };
//        emps.sort(comparator);

        System.out.println(emps);








    }
}


class Emps implements Comparable<Emps> {

    private int id;
    private String name;
    private String salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emps{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Emps(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Emps o) {
        return this.name.compareTo(o.getName());
    }




}




