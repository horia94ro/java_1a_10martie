   public class Exemplul5{
        public static void main(String[] args){
        int zi = 99;
        switch(zi){
            case 1:
                System.out.println("LUNI :(");
                break;
            case 2:
                System.out.println("MARTI! ");
                break;
            case 3:
                System.out.println("MIERCURI :|!");
                break;
            case 4:
                System.out.println("JOI :)");
                break;
            case 5:
                System.out.println("VINERI! :D");
                break;
            case 6:
            case 7:
                System.out.println("WEEKEND!!");
                break;
            default:
                System.out.println("Valoarea nu este valida");
                break;
        }
    }
}