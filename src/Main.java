import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
public class Main {
    private static final Map<Character, Integer> romanValues = new HashMap<>();
    static {
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
    }
    public static int romanToDecimal(String roman) {
        int total = 0;
        int counter = 0;
        roman=roman.toUpperCase();
        for (int i = 0; i < roman.length() - 1; i++) {
            char currentSymbol = roman.charAt(i);
            String nuevocurrent= String.valueOf(currentSymbol);
            int nextValue = romanValues.get(roman.charAt(i + 1));
            int currentValue = romanValues.get(currentSymbol);
            if (currentValue==nextValue){
                counter++;
                total += currentValue;
                if(nuevocurrent.equals("V") || nuevocurrent.equals("L") || nuevocurrent.equals("D")){//Las letras V,L y D no se pueden repetir más de dos veces.
                    counter = 0;
                    total=0;
                    return total;
                }
                if (counter>2){
                    counter = 0;
                    total=0;
                    return total; // regresa cero si ya paso el limite de 3 veces repetido.
                }
            }
                 // filtro donde el valor actual es menor al valor que le sigue
            else if (currentValue < nextValue) {
                if (((counter>=1) && currentValue <romanValues.get(roman.charAt(i - 1))) || counter==0 ) {
                    String hola="Hola soy un filtro especial ";
                }else {
                    total =0;
                    return total;}
                if(i>0){
                    //Filtros donde si los valores precedentes concuerdan con la regla.
                    //I precede a V y a X
                    //X precede a L y a C
                    // C precede a D y a M
                    if(nextValue == romanValues.get(roman.charAt(i - 1))) {
                        if (nextValue==10 && currentValue==1){
                            total -=currentValue;
                        } else if (nextValue==100 && currentValue==10) {
                            total -=currentValue;

                        }else if (nextValue==1000 && currentValue==100) {
                            total -=currentValue;
                        }else { // si  no pasa los filtros se regresa a 0
                            total=0;
                            return total;
                        }
                    }
                }
                else if (currentValue==1 && (nextValue==5 || nextValue==10)) {
                    total -= currentValue;
                } else if (currentValue==10 && (nextValue==50 || nextValue==100)) {
                    total -= currentValue;
                } else if (currentValue==100 && (nextValue==500 || nextValue==1000)) {
                    total -= currentValue;
                }
                else {
                    return total;
                }
            } else {
                //filtro para el valor que sigue es igual con el ultimo valor del numero romano.
                //siempre y cuando el valor actual sea mayor al valor que le sigue y i es mayor 0
                if(i>0 && nextValue==romanValues.get(roman.charAt(i - 1))) {
                    total=0;
                    return total;
                }
                total += currentValue;
            }
        }
        return total+romanValues.get(roman.charAt(roman.length()-1));
    }
    public static void main(String[] args) throws IOException {
        String filename="archivo_Romano.csv";
        if (args.length>0) {
            try (PrintWriter writer=new PrintWriter(new FileWriter(filename))) {
                writer.println("Numero Romano,Numero Decimal");//cabecera
                for(String s : args) { // se agregan los valores en sus respectivas columnas
                    if(romanToDecimal(s)!=0) {
                        writer.println(s+","+romanToDecimal(s));
                    }
                }
                System.out.println("Archivo CSV generado!");
            }catch (NullPointerException e){
                System.out.println("Ingresaste un formato invalido!");
            }
        }

    }
}
