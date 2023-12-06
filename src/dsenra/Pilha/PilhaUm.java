package dsenra.Pilha;

public class PilhaUm implements IPilha {

    private PilhaUm pilhaAnterior;
    private Integer valor;

    public PilhaUm() {

    }

    public PilhaUm(PilhaUm pilhaAnterior, Integer valor) {
        this.pilhaAnterior = pilhaAnterior;
        this.valor = valor;
    }

    @Override
    public void push(int valor) {
        this.pilhaAnterior = new PilhaUm(this.pilhaAnterior, this.valor);
        this.valor = valor;
    }

    @Override
    public int pop() {
        if (this.isEmpty())
            throw new IllegalArgumentException("A pilha está vazia!");
        int valorTop = this.valor;
        this.valor = this.pilhaAnterior.valor;
        this.pilhaAnterior = this.pilhaAnterior.pilhaAnterior;
        return valorTop;
    }

    @Override
    public int top() {
        if (this.isEmpty())
            throw new IllegalArgumentException("A pilha está vazia!");
        return this.valor;
    }

    @Override
    public boolean isEmpty() {
        return this.pilhaAnterior == null;
    }

    @Override
    public int size() {
        return this.isEmpty() ? 0 : 1 + this.pilhaAnterior.size();
    }
}
