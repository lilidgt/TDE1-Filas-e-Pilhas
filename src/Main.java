public class Main {
    //só para testar
    
    public static void main(String[] args) {
            Pilha pilha = new Pilha();

            //inserir valor na pilha
            pilha.inserir(10);
            pilha.inserir(20);
            pilha.inserir(30);

            //imprimir pilha
            pilha.imprimir();

            //remover valor na pilha
            pilha.remover();

            //imprimindo pilha após remoção do valor
            pilha.imprimir();
    }
}
