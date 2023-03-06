
public class Teste_03{
    public static void main(String[] args) {
        double vetor[] = new double[30];//30 dias e um mês
        
        /* double vlrfaturamento = 1000;
        int cont=0;
        for(int i = 0; i<vetor.length ;i++){
            if(cont%3!=0){
                vetor[i] = vlrfaturamento;
                vlrfaturamento+=1000;   
                cont++;             
            }else{
                vetor[i]=0;
                cont++;
            }
            System.out.println(vetor[i]);
        } */

        vetor[0] = 5000; 
        vetor[1] = 110;
        vetor[2] = 5500;
        vetor[3] = 90; 
        vetor[4] = 000;
        vetor[5] = 000;
        vetor[6] = 7000;
        vetor[7] = 6000;
        vetor[8] = 3800;
        vetor[9] = 50;
        vetor[10] = 8000;
        vetor[11] = 0;
        vetor[12] = 00;

        

        double maiorFaturamento = 0;
        double menorFaturamento = Double.POSITIVE_INFINITY;
        double media = 0;
        double cont = 0;

        for(int i = 0; i<vetor.length;i++){
            if(i==0 && vetor[i] != 0){
                maiorFaturamento=vetor[i];
                menorFaturamento=vetor[i];
                media+=vetor[i];
                cont++;
            }
            else{
                if(vetor[i] != 0){
                    media+=vetor[i];
                    cont++;
                    if(vetor[i]>maiorFaturamento){
                        maiorFaturamento=vetor[i];
                    }
                    if(vetor[i]<menorFaturamento){
                        menorFaturamento=vetor[i];
                    }
                }
                
            }
        }

        media = media / cont;
        int contadorAcimaMedia = 0;

        for(int i = 0;i< vetor.length;i++){
            if(vetor[i]>media){
                contadorAcimaMedia++;
            }
        }


        System.out.println("O MENOR valor de Faturamento é: "+ menorFaturamento);
        System.out.println("O MAIOR valor de Faturamento é: "+ maiorFaturamento);
        System.out.println("A MÉDIA dos valores é: "+ media);
        System.out.println("A QUANTIDADE de valores acima da média é: "+ contadorAcimaMedia);
    }
}