package dsenra.Fila;

public class FilaUm implements IFila {

    private FilaUm primeiroFila;
    private FilaUm filaProximo;
    private FilaUm filaUltimo;
    private Integer valor;
    private Integer tamanho = 0;

    public FilaUm() {

    }

    public FilaUm(Integer valor) {
        this.valor = valor;
    }

    @Override
    public void enqueue(int valor) {
        FilaUm filaTemporario = new FilaUm(valor);
        if (this.isEmpty()) {
            this.primeiroFila = filaTemporario;
            this.primeiroFila.filaProximo = new FilaUm();
        }
        else
            this.filaUltimo.filaProximo = filaTemporario;
        filaUltimo = filaTemporario;
        tamanho++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("A fila está vazia!");
        }
        int valorRemover = primeiroFila.valor;
        primeiroFila = primeiroFila.filaProximo;
        if (isEmpty()) {
            filaUltimo = null;
        }
        tamanho++;
        return valorRemover;
    }

    @Override
    public int rear() {
        if (this.isEmpty())
            throw new IllegalArgumentException("A pilha está vazia!");
        return this.filaUltimo.valor;
    }

    @Override
    public int front() {
        if (this.isEmpty())
            throw new IllegalArgumentException("A pilha está vazia!");
        return this.primeiroFila.valor;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public boolean isEmpty() {
        return this.primeiroFila == null;
    }
}
