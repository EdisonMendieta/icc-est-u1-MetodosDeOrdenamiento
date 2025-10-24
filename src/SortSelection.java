public class SortSelection{

    public SortSelection(){

    }

    public void sortAscendente(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            int i_menor = i;

            //hallamos la ubicacion del menor
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j] < numeros[i_menor]){
                    i_menor = j;
                }
            }

            //si la ubicacion es diferente a la posion anclada, hacemos un cambio
            if (i != i_menor){
                int aux = numeros[i];
                numeros[i] = numeros[i_menor];
                numeros[i_menor] = aux; 

            }  
        }
    }

    public void sortDescendente(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            int i_menor = i;

            //hallamos la ubicacion del mayor
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j] > numeros[i_menor]){
                    i_menor = j;
                }
            }

            //si la ubicacion es diferente a la posion anclada, hacemos un cambio
            if (i != i_menor){
                int aux = numeros[i];
                numeros[i] = numeros[i_menor];
                numeros[i_menor] = aux; 

            }   
        }
    }

    public void printArray(int[] numeros) {

        System.out.print("[ ");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length -1){
                System.out.println(numeros[i] + "]");
            }else{
                System.out.print(numeros[i] + ", ");
            }
        }
        
    }

}