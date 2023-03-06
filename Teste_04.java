import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Teste_04 {
    public static void main(String[] args) {

        Map<String,  Double> valoresDistribuidora = new HashMap<>();
        valoresDistribuidora.put("sp", 67836.43);
        valoresDistribuidora.put("rj", 36678.66);
        valoresDistribuidora.put("mg", 29229.88);
        valoresDistribuidora.put("es", 27165.48);
        valoresDistribuidora.put("outros", 19849.53);

        double soma = 0;
        
        /* for(Map.Entry vd : valoresDistribuidora.entrySet()){
            System.out.println("O estado: "+vd.getKey()+" faturou R$"+vd.getValue());
        } */
        for(double valor : valoresDistribuidora.values()){
            soma += valor;
        }
        System.out.println("---"+soma+"---");

        for(Map.Entry vd : valoresDistribuidora.entrySet()){

            Object estado = vd.getKey();
            
            if(vd.getKey().equals(estado)){
                double porcentagem = Double.valueOf((Double) vd.getValue());
                porcentagem = (porcentagem*100)/soma;
                String txt = new DecimalFormat("#,##").format(porcentagem);
                System.out.println(estado+" corresponde a aproximadamente "+txt+"% do faturamento");
            }
        }
    }
}
