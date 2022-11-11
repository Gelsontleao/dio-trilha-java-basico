public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        //if-else
        if(plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if(plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp e Instagram grátis");
        } else if(plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp e Instagram grátis");
            System.out.println("5Gb de Youtube");
        } else {
            System.out.println("Opção Inválida");
        }

        //switch-case
        switch(plano) {
            case "T":{
                System.out.println("5Gb de Youtube");
            }
            case "M":{
                System.out.println("Whatsapp e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }
            default:
                System.out.println("Opção Inválida");
        }
    }
}
