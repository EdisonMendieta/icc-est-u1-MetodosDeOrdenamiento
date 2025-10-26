public class SortInsercion {

    public SortInsercion() {
        }

    public void SortInsercionAscendente(int[] numeros,boolean pasos) {
        for(int i = 0; i < numeros.length; i++) {
            int j = i-1;
            int aux = numeros[i];
            if (pasos){
                System.out.println("i: "+ i + ", j: " + j + " aux: " + aux);
            }
            
            while(j >= 0 && numeros[j] > aux){
                if (pasos){
                System.out.println("compara aux: "+ aux + ", con numeros: [ " + j + " ]" + numeros[j]);
                }
                numeros[j+1] = numeros[j];

                if (pasos){
                System.out.println("numeros");
                }
                j--;
                if (pasos){
                System.out.println("mueve numeros [" + (j+1) + " ] " + " ] a numeros [ " + (j+2) +"]");
                }
                
            }
            numeros[j+1] = aux;
        }
    }

    public void SortInsercionAscendente(Persona[] numeros) {
        for(int i = 0; i < numeros.length; i++) {
            int j = i-1;
            Persona aux = numeros[i];
            
            while(j >= 0 && numeros[j].getAge() > aux.getAge()){
                numeros[j+1] = numeros[j];
                j--;
            }
            numeros[j+1] = aux;
        }
    }

    public void SortInsercionDescendente(Persona[] numeros) {
        for(int i = 0; i < numeros.length; i++) {
            int j = i-1;
            Persona aux = numeros[i];
            
            while(j >= 0 && numeros[j].getAge() < aux.getAge()){
                numeros[j+1] = numeros[j];
                j--;
            }
            numeros[j+1] = aux;
        }
    }
    
    public void SortInsercionDescendente(int[] numeros,boolean pasos) {
        for(int i = 0; i < numeros.length; i++) {
            int j = i-1;
            int aux = numeros[i];
            if (pasos){
                System.out.println("i: "+ i + ", j: " + j + " aux: " + aux);
            }
            
            while(j >= 0 && numeros[j] < aux){
                if (pasos){
                System.out.println("compara aux: "+ aux + ", con numeros: [ " + j + " ]" + numeros[j]);
                }
                numeros[j+1] = numeros[j];

                if (pasos){
                System.out.println("numeros");
                }
                j--;
                if (pasos){
                System.out.println("mueve numeros [" + (j+1) + " ] " + " ] a numeros [ " + (j+2) +"]");
                }
                
            }
            numeros[j+1] = aux;
        }
    }

    public void SortPersonas_Ascendente(String[] nombres) {
        for(int i = 0; i < nombres.length; i++) {
            int j = i-1;
            String aux = nombres[i];
            
            while(j >= 0 && nombres[j].compareTo(aux) > 0 ){
                nombres[j+1] = nombres[j];
                j--;   
            }
            nombres[j+1] = aux;
        }

    } 

    public void SortPersonas_Ascendente(Persona[] nombres) {
        for(int i = 0; i < nombres.length; i++) {
            int j = i-1;
            Persona aux = nombres[i];
            
            while(j >= 0 && nombres[j].getName().compareTo(aux.getName()) > 0 ){
                nombres[j+1] =nombres[j];
                j--;   
            }
            nombres[j+1] = aux;
        }

    } 
    
    public  void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {

            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i]+ ", ");
            }
            
            
        }
        System.out.println("]");
    }

    public  void printArray(String[] nombres) {
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++) {

            if (i == nombres.length - 1) {
                System.out.print(nombres[i]);
            } else {
                System.out.print(nombres[i]+ ", ");
            }
            
            
        }
        System.out.println("]");
    }

    public  void printArray(Persona[] nombres) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i].getName()
                                + ", Edad: " + nombres[i].getAge() );
        }
    }
}
