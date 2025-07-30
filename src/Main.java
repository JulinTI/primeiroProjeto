//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(" Esse é o Screen Match !");
        System.out.println(" Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (8.3 + 5.4 + 2.9) / 3;
        System.out.println("A média dos valores é: " + media);
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        //casting          //casting - transformando double em interiro
        int classificacao = (int) (media/2);
        System.out.println("O filme possui: " + classificacao + " estrelas");

        // temperatura de celsius para fahrenheit
        double temperaturaCelsius = 31.2;

        double fahrenheit = (temperaturaCelsius * 1.8) + 32;

        int temperatura = (int) fahrenheit;
        System.out.println(temperatura + " Graus Fahrenheit");


    }
}