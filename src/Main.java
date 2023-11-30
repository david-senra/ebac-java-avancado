public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Primeiro Exercício - Java Avançado");
        System.out.println();
        ListaEncadeada listaTest = new ListaEncadeada();
        listaTest.push(2);
        listaTest.push(5);
        listaTest.push(9);
        System.out.println();
        listaTest.printList();
        System.out.println();
        System.out.println("Tamanho da Lista: " + listaTest.size());
        System.out.println();
        listaTest.insert(3, 3);
        System.out.println();
        listaTest.printList();
        System.out.println();
        System.out.println("Tamanho da Lista: " + listaTest.size());
    }
}