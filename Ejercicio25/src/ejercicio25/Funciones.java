package ejercicio25;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Funciones {
    //static int num[] =new int[6];
    static ArrayList num=new ArrayList();
    static ArrayList numG=new ArrayList();
    static int pos=-1;
    
    public static void addNum(int x){
        if(pos<6){
            num.add(x);
        }else JOptionPane.showMessageDialog(null, "Ya has escogido 6 numeros");
    }
    public static String numerosSelec(){
        String numeros="Has seleccionado los numeros:";
        for(int i=0; i<num.size(); i++){
            numeros=numeros+" "+num.get(i);
        }
        return numeros;
    }
    public static String generarNum(){
        numG.clear();
        for(int i=0; i<6; i++){
            int numero;
            numero=(int) (Math.random()*(50-1)+1);
            numG.add(numero);
        }return ("Los numeros ganadores son: "+numG.toString());
    }
    public static String contarAciertos(){
        int aciertos=0;
        for(int i=0; i<num.size(); i++){
            for(int j=0; j<numG.size(); j++){
                if(num.get(i)==numG.get(j)){
                    aciertos++;
                }
            }
        }
        return ("Has acertado\n"+aciertos);
    }
    
}
