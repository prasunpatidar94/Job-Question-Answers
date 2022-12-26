import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String in= "hellol wllllllorld";
        for(int i =0; i<(in.length()-1); i++){

            if(in.contains("l")) {
                if (in.charAt(i) == 'l') {
                    if (in.charAt(i + 1) == 'l')
                        in = in.replace("ll", "$#");
                    else
                        in = in.replace('l', '$');
                }
            }
            else
                break;

        }
        System.out.println(in);


//        System.out.println("======================================");
//
//        if(in.charAt(i)=='l' && in.charAt(i+1)=='l')
//            in = in.replace("ll", "$#");
//        else
//            in = in.replace('l', '$');

//
//        List data = Arrays.asList(1,2,3,4,5,6);
//
//        data =data.stream().sorted(Collections.reverseOrder()).skip(3).collect(Collectors.toList());
//        Integer sum= data.stream().
//




    }
}




