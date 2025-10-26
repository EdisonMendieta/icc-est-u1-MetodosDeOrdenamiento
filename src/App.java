public class App {
    public static void main(String[] args) throws Exception {
        //tipoVariable nombreVariable = valorVariable;
        int[]numeros = {10,0,-5,5,15,2};
        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        Persona[] personas = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };
        System.out.println("Estudiante: Edison mendieta Armijos");
      
        //bubblesort(numeros);
        //printArray(numeros);
        //CREO LA CLASE SORTBUBBLE
        //CREAR LA CLASE == INSTANCIAR LA CLASE
        //SortBubble claseSortBubble = new SortBubble();
        //claseSortBubble.printArray(numeros); //Imprime
        //claseSortBubble.sortBubble(numeros); //ORDENA
        //System.out.println("Ordenado");
        //claseSortBubble.printArray(numeros);//Imprime

        //claseSortBubble.sortBubbleAvzAscendente(numeros);
        //claseSortBubble.printArray(numeros); //Imprime

        //claseSortBubble.sortBubbleAvzDescendente(numeros);
        //claseSortBubble.printArray(numeros);

        //Selection
        /*SortSelection claseSortSelection = new SortSelection();
        System.out.println("Metodo Seleccion");
        System.out.println("Original");
        claseSortSelection.printArray(numeros);
        claseSortSelection.SortAscendente(numeros);
        System.out.println("Ordenado Ascendente: ");
        claseSortSelection.printArray(numeros);
        System.out.println("Ordenado Descendente: ");
        claseSortSelection.SortDescendente(numeros);
        claseSortSelection.printArray(numeros);
        */
        System.out.println("Método Inserción");
        //System.out.println("Original: ");
        SortInsercion sortInsertion = new SortInsercion();
        /*sortInsertion.printArray(numeros);
        System.out.println("Ordenado Ascendente");
        sortInsertion.SortInsercionAscendente(numeros,false);
        sortInsertion.printArray(numeros);
        System.out.println("Ordenado Descendente");
        sortInsertion.SortInsercionDescendente(numeros,false);
        sortInsertion.printArray(numeros);

        System.out.println("Array de Nombres Originales:");
        sortInsertion.printArray(nombres);
        sortInsertion.SortPersonas_Ascendente(nombres);
        System.out.println("Ordenado por Nombre:");
        sortInsertion.printArray(nombres);*/

        System.out.println("Array de Personas Original:");
        sortInsertion.printArray(personas);
        /*System.out.println("\nOrdenado por Nombres de Personas:");
        sortInsertion.SortPersonas_Ascendente(personas);
        sortInsertion.printArray(personas);*/

        System.out.println("\nOrdenado por Edad ");
        System.out.println("\nAscendente: ");
        sortInsertion.SortInsercionAscendente(personas);
        sortInsertion.printArray(personas);
        System.out.println("\nDescendente: ");
        sortInsertion.SortInsercionDescendente(personas);
        sortInsertion.printArray(personas);
    }    
}
