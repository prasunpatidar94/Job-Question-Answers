import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class StringAllMethods {
    public static void main(String[] args) {


        String strForCharAt = "Prasun";
        System.out.println("CharAt : " + strForCharAt.charAt(2));

        String strForLenth = "Prasun";
        System.out.println("length  : " + strForLenth.length());

        String strForSubString = "Prasun";
        System.out.println("SubString  : " + strForSubString.substring(2));

        String strForSubString2 = "Prasun";
        System.out.println("SubString  : " + strForSubString2.substring(2, 4));

        String strForContaines = "Prasun";
        System.out.println("contains  : " + strForContaines.contains("Pra") + "   " + strForContaines.contains("Pat"));

        String strForJoin = "Prasun";
        System.out.println("Join  : " + String.join("-", "Prasun", "patidar"));

        List<String> list = Arrays.asList("Prasun","Patidar","is","good","boy","!");
        System.out.println("Join  : " + String.join("_", list));

        String str1 = "Prasun";
        String str2 = "Prasun";
        String str3 = new String("Prasun");
        System.out.println("Equals string litrels or containt  pool  : "+ str1.equals(str2));
        System.out.print("Double '==' string litrels or containt  pool  : ");
        System.out.println(str1==str2);
        System.out.println("Equals string litrels and String object  : "+ str1.equals(str3));
        System.out.print("Double '==' string litrels and String object  : ");
        System.out.println( str1==str3);


        String strIsEmpty= " ";
        System.out.println("IsEmpty : "+strIsEmpty.isEmpty());// false because white space is there
        System.out.println("IsEmpty : "+strIsEmpty.isBlank());// true because it will not count white space count only  data

        String name = "Prasun";
        String sname = "Patidar";
        //concat =>combile two sting, if 2nd string blank then retun same string object , return type string , crate new object,throw nullpointerexception when add null with sting
        System.out.println("Concate : "+ name.concat(sname));
        // + => combine multipal string , always create new string , add sting with int float, etc, not throw any exception
        // jvm read bl;ow core is "String s=(new StringBuilder()).append("Prasun").append("Patidar).toString();  "
        System.out.println("Concate : "+ name+sname);


        String strForReplace = "Prasun";
        System.out.println("replacement : "+strForReplace.replace('P','L')); //charactor replacement
        System.out.println("replacement : "+strForReplace.replace("Pra","Las")); //String replacement

        String strEqualIgnoreCase1 = "PRASUN";
        String strEqualIgnoreCase2 = "prasun";
        System.out.println("EqualIgnoreCase : "+ strEqualIgnoreCase1.equalsIgnoreCase(strEqualIgnoreCase2));//not consider case sencitive

        String strForSplit ="Prasun patidar Is Good Boy";
        List<String> listForSplit1= Arrays.asList(strForSplit.split(" ")); //full partation
        List<String> listForSplit2= Arrays.asList(strForSplit.split(" ",3));// 3 partation
        System.out.println("Split : "+listForSplit1);
        System.out.println("Split : "+listForSplit2);


        String strForIntern1=  new String("Prasun");
        String strForIntern2= "Prasun";
        String strForIntern3=  strForIntern1.intern(); //create copy of the string pool object instide the String Consteint pool
//        "intern (without) : "+
        System.out.println( strForIntern1 == strForIntern2);
//        "intern (with) : "+
        System.out.println( strForIntern2 == strForIntern3);


        String strIndexOf= "Prasun Patidar";

        System.out.println("IndexOf : "+ strIndexOf.indexOf('a'));
        System.out.println("IndexOf : "+ strIndexOf.indexOf("sun"));
        System.out.println("IndexOf : " + strIndexOf.indexOf('a',4));
        System.out.println("IndexOf : " + strIndexOf.indexOf("sun",4));

        String strUpperAndLower = "Prasun";
        System.out.println("UpperCase : " + strIndexOf.toUpperCase());
        System.out.println("LowerCase : " + strIndexOf.toLowerCase());
        System.out.println("UpperCase : " + strIndexOf.toUpperCase(Locale.forLanguageTag("tr")));
        System.out.println("LowerCase : " + strIndexOf.toLowerCase(Locale.forLanguageTag("tr")));


        String strTrim ="      Prasun          ";
        System.out.println("Trim  : "+ strTrim.trim());

        Integer strValueOf = 1000;

//        use to convert the Type for special case

        System.out.println( Float.valueOf("1000") +strValueOf);
        System.out.println( Integer.valueOf("1000") +strValueOf);
        System.out.println( String.valueOf("1000") +strValueOf);
        System.out.println( Double.valueOf("1000") +strValueOf);

//=============================================
//        Comparable

        String strCompareTo1 = "Prasun";
        String strCompareTo2 = new String("Prasun");
        String strCompareTo3 = "Prasun Patidar";

//        same return 0
//        1st big then 2nd return +ve int
//        1 less then 2nd return -ve Int
        System.out.println("Compate To "+ strCompareTo1.compareTo(strCompareTo2));
        System.out.println("Compate To "+ strCompareTo1.compareTo(strCompareTo3));
        System.out.println("Compate To "+ strCompareTo3.compareTo(strCompareTo2));


















    }
}
