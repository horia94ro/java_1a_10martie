public class Exemplul4{
    public static void main(String[] args){
        boolean b1 = (10 >= 3) && (7 <= 10);
        boolean b2 = 100 > 101 || 101 < 102;
        boolean b3 = b1 && b2;
        boolean b4 = !b3;
        
        System.out.println(b1); //true
        System.out.println(b2); //true
        System.out.println(b3); //true
        System.out.println(b4); //false
    }
}