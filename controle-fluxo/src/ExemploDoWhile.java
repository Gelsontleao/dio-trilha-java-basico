import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        
        System.out.println("Discando...");

        do{
            //executado repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        } while(tocando());

        System.out.println("Alô !!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(30) == 1;
        System.out.println("Atendeu? " + atendeu); 
        //negando o ato de continuar tocando
        return !atendeu;
    }
}
