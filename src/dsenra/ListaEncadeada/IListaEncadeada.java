package dsenra.ListaEncadeada;

public interface IListaEncadeada {
    void push(int valor);
    int pop();
    void insert(int index, int valor);
    void remove(int index);
    int elementAt(int index);
    int size();
    void printList();
}
