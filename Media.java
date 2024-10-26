public class Media {

    public void media(double nota1, double nota2, double nota3, double nota4) {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println(String.format("%.1f", media));
    }
}
