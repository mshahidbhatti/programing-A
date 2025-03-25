public class Test {
    public static void main(String[] args) {
        Example objA=new Example();
        Example objB=objA;
        objA.show();
        objB.show();
        objA=null;
        objB.show();



    }
}
