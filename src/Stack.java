public class Stack {

    int tamanho = 0;
    ElementoStack primeiroElemento = null;

    public Stack () {
    }

    public void push(int data) {
        ElementoStack elementoTemp = new ElementoStack(data);
        elementoTemp.setProximoElemento(primeiroElemento);
        primeiroElemento = elementoTemp;
        tamanho++;
    }

    public void pop() {
        if(isEmpty()){
            System.out.println("Não há elementos para remover. A pilha está vazia!");
        }
        else {
            ElementoStack elemento = primeiroElemento;
            primeiroElemento = primeiroElemento.getProximoElemento();
            tamanho--;
            System.out.print("Removendo o elemento no topo da pilha, que é: ");
            System.out.print(elemento.getDado());
            System.out.println();
        }
    }

    public void top(){
        if(isEmpty()){
            System.out.println("Não há elemento no topo. A pilha está vazia!");
        }
        else {
            System.out.print("O atual elemento no topo da pilha é: ");
            System.out.println(primeiroElemento.getDado());
        }
    }

    public int size(){
        return tamanho;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }
}
