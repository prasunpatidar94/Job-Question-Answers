public class Singaltone{

    private Singaltone obj= null;

    private Singaltone(){}

    public Singaltone singaltoneget(){
        if(obj==null){
            synchronized (Singaltone.class){
                if (obj==null)
                    this.obj=new Singaltone();
            }
        }
        return obj;
    }

}




