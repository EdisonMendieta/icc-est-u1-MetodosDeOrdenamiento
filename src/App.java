public class App {
    public static void main(String[] args) throws Exception {
        int [] numeros = {2, 4, 5, 10, -1 };
        SortSelection sort = new SortSelection();
        sort.printArray(numeros);
        sort.sortAscendente(numeros);
        sort.printArray(numeros);
        sort.sortDescendente(numeros);
        sort.printArray(numeros);
    }
}
