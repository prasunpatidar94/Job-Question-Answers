interface I1{

    static void test(){
        System.out.println("I1");

    }
}

interface I2{

    static void test(){
        System.out.println("I2");

    }
}




public class Test implements I1,I2 {


    public static void main(String[] args) {


        I1 i1 = new Test();

        I1.test();

    }



}
