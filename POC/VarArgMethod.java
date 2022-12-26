public class VarArgMethod {

    public static void main(String[] args) {


        Emp e = new Emp();

        System.out.println(e.add());
        System.out.println(e.add(10));
        System.out.println(e.add(10,20));
        System.out.println(e.add(10,20,30));
        System.out.println(e.add(10,20,30,40));


    }



}

class Emp{

    public Integer add(Integer ... a ){

        return  a.length;
    }
}