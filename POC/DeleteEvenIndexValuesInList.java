import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteEvenIndexValuesInList {

    public static void main(String[] args) {

        //0,  1, 2 ,3,4, 5 , 6 ,7 ,8
        List<Integer> list = new ArrayList<>();
        list.add(10);//0
        list.add(20);//1
        list.add(30);//2
        list.add(40);//3
        list.add(50);//4
        list.add(60);//5
        list.add(70);//6
        list.add(80);//7
        list.add(90);//8

//        Approch- 2
        list.removeAll(
                list.stream().filter(e -> list.indexOf(e) % 2 == 0).collect(Collectors.toList())
        );

//        Approch- 2
//        list.removeIf(e -> list.indexOf(e) % 2 == 0);

        System.out.println(list);

//        optput  : [20, 40, 60, 80]

    }


}
