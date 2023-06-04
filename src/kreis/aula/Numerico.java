package kreis.aula;

import java.util.Arrays;
import java.util.List;

public class Numerico {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(5, 22, 66, 99, 16, 44); 
        
        int[] hashedValues = hashNumericValues(values);
        System.out.println("Hashed values: " + Arrays.toString(hashedValues));
    }
    
    public static int[] hashNumericValues(List<Integer> values) {
        int[] hashedValues = new int[10]; 
        
        for (int value : values) {
            int hash = value / 10; 
            hashedValues[hash] = value;
        }
        
        return hashedValues;
    }
}
