import java.util.Scanner;
    
public class Teste_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num_escolhido = scan.nextInt();
        boolean pertenceFibonacci = false;
        int primTermo = 0;
        int segTermo = 1;
        int cont = 0;

        String txt = "0, 1";

        while(pertenceFibonacci == false){
            
            int soma = primTermo + segTermo;
            int aux = segTermo;
            segTermo = soma;            
            primTermo = aux;
            txt += ", "+segTermo;
            if(num_escolhido == segTermo){
                pertenceFibonacci = true;
            }
            if(soma>num_escolhido){
                break;
            }
        }

        System.out.println(txt);

        if(pertenceFibonacci == true || num_escolhido == 0){
            System.out.println("O número escolhido pertence a Sequencia de Fibonacci");
        }
        else{
            System.out.println("O número escolhido NÃO pertence a Sequencia de Fibonacci");
        }
    }

}
    