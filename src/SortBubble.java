public class SortBubble{
    
    public void printArrary(int[] num){
        System.out.print(" [ ");
        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1){
                System.out.print(num[i]);
            }
            else{ 
                System.out.print(num[i]+", ");
            }
        }
        System.out.println(" ]");
    }
    public void sortbubbleAscendente(int[] numeros){
        
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]){
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;

                }        
            }
            
        }
    }

    public void sortbubbleDescedente(int[] numeros){
        
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]){
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;

                }        
            }
            
        }
    }

} 