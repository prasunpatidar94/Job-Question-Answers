import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EqualsAndHashMap {

    public static void main(String[] args) {


        StudentClass s1 = new StudentClass(101,"Prasun","JAVA");
        StudentClass s2 = new StudentClass(101,"Prasun","JAVA");

        System.out.println("== : "+(s1==s2));
        System.out.println("equals : "+(s1.equals(s2)));
        System.out.println("HashCode of s1: "+ s1.hashCode());
        System.out.println("HashCode of s2: "+ s2.hashCode());



    }
}


class StudentClass{

    private Integer rollNo;
    private String sName;
    private String sClass;

    public StudentClass(Integer rollNo, String sName, String sClass) {
        this.rollNo = rollNo;
        this.sName = sName;
        this.sClass = sClass;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentClass that = (StudentClass) o;
        return rollNo.equals(that.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}

