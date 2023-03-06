import java.util.Scanner;

public class Teste_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a palavra/frase que deseja inverter:");
        String txt = scan.nextLine();

        String[] vtr = txt.split("");

        /* for(String letras : vtr){
            System.out.println(letras);
        } */

        String textoInvertido="";
        for(int i = vtr.length - 1; i >= 0; i--){
            textoInvertido += vtr[i];
        }
        System.out.println("Invertendo a palavra fica: "+textoInvertido);

        scan.close();
    }
}
