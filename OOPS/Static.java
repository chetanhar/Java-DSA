package OOPS;

public class Static extends Animal {

    Static(int x){
        System.out.println(x);
    }
    String cd="df";
    String f="r";
    static String cf="fr";
    static final String data;
    static {data="100";}

    public static void main(String[] args) {
       // System.out.println(cf);
        Static c=new Static(10);
//        c.check();
//        c.specs();
        System.out.println(Static.data);
    }
    @Override
    public void specs() {
        System.out.println("static");
    }

    private static void check(){
        System.out.println(cf);
    }

}
class Animal{
    protected void specs(){
        System.out.println("class animal");
    }
}
