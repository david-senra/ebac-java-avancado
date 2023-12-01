package dsenra.Fila;

public interface IFila {
    void enqueue(int valor);
    int dequeue();
    int rear();
    int front();
    int size();
    boolean isEmpty();
}
