public class Exemplul1{
    public static void main(String[] args){
        byte b1 = 10;
        byte b2;
        System.out.println(b1);
        //System.out.println(b2); - nu pot afisa pe b2 inainte sa fie initializat
        b2 = 15;
        short s1 = (short)15;
        short s2, s3 = 20;
        
        int i1 = 10;
        int i2 = 0xFA; //baza 16
        int i3 = 0b10101101; //baza 2
        int i4 = 075; //baza 8
        
        long l1 = 1000000000000L;
        long l2 = 3_45_6_789;
        
        double d1 = 10.5;
        float f1 = 12.5F;
        float f2 = (float) 17.3;
        System.out.println(f2);
        
        char c1 = 'a';
        char c2 = '\u0460';//ma refer la pozitia din tabela Unicode
        char c3 = '\t';
        char c4 = '\n';
        System.out.println(c2);
        
        boolean bl1 = true;
        boolean bl2 = false;
        c1 = 1000; //ma refer la pozitia din tabela Unicode
        System.out.println(c1);
        //l1 = true; //l1 declarat de tip long nu poate fi "convertit" la boolean
        
        
        
        
        
        
        
        
        
        
        
    }
}