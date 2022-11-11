public class ExpressaoTernaria {
    public static void main(String[] args) {
        int nota = 6;
        
        //se "?" verdadeiro imprimime Aprovado se ":" falso imprime Reprovado
        String condicao1 = nota >= 7 ? "Aprovado" : "Reprovado";

        //
        String condicao2 = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        
        System.out.println(condicao1);
        System.out.println(condicao2);
    }
}
