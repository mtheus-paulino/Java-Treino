import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble() * 2;
        double n2 = sc.nextDouble() * 3;
        double n3 = sc.nextDouble() * 4;
        double n4 = sc.nextDouble() * 1;
        double nExame = 0.0;

        double somaPesos = 10;
        double media = (n1 + n2 + n3 + n4) / somaPesos;
        media = Math.floor(media * 10) / 10;

        if (media >= 7.0){
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        }else {
            nExame = sc.nextDouble();
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f%n", nExame);
            media = (media + nExame) /2;
            System.out.println(media >= 5.0 ? "Aluno aprovado" : "Aluno reprovado");
            System.out.printf("Media final: %.1f%n", media);
        }
    }
}