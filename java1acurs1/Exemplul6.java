public class Exemplul6{
    public static void main(String[] args){
        char anotimp = 'v';
        switch(anotimp){
            case 'v':
                System.out.println("CALDURA MARE");
                break;
            case 'i':
                System.out.println("FREG");
                break;
            case 't':
            case 'p':
                System.out.println("PLOO! :( ");
                break;
            default:
                System.out.println("Caracterul nu corespunde unui anotimp!");
        }
    }
}