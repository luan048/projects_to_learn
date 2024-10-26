public class Media {
    public void media(double nota1, double nota2, double nota3, double nota4) {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media < 7) {
            System.out.println("Reprovado! Com media de: " + String.format("%.1f", media));
        }
        else {
            System.out.println("Aprovado! Com média de: " + String.format("%.1f", media) + " Parabéns! ");
        }
    }
}