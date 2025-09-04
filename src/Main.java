public class Main {
    //só para testar
    
    public static void main(String[] args) {
            Pilha pilha = new Pilha();

            pilha.inserir(10);
            pilha.inserir(20);
            pilha.inserir(30);

            // Mostra o topo (se tiver peek)
            pilha.imprimir();
            pilha.remover();
            // Ou percorre toda a pilha
            pilha.imprimir();
}
