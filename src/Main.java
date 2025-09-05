public class Main {
    //só para testar
    
    public static void main(String[] args) {
            //TESTE PILHA
            System.out.println("Pilha: ");
            Pilha pilha = new Pilha();
            pilha.inserir(10);
            pilha.inserir(20);
            pilha.inserir(30);
            pilha.imprimir();
            pilha.remover();
            pilha.imprimir();
            System.out.println("---------");

            //TESTE FILA
            System.out.println("Fila: ");
            Fila fila = new Fila();
            fila.inserir(10);
            fila.inserir(20);
            fila.imprimir();
            fila.remover();
            fila.imprimir();
            fila.remover();
            fila.imprimir();
            System.out.println("---------");

            // TESTE MERGE FILA
            System.out.println("Merge Fila: ");
            Fila fila1 = new Fila();
            Fila fila2 = new Fila();
            fila1.inserir(1);
            fila1.inserir(3);
            fila1.inserir(5);
            fila1.inserir(7);
            fila1.inserir(9);
            fila2.inserir(2);
            fila2.inserir(4);
            fila2.inserir(6);
            fila2.inserir(8);
            fila2.inserir(10);
            //filas originais
            System.out.println("fila1 original:");
            fila1.imprimir();
            System.out.println("fila2 original:");
            fila2.imprimir();
            //fila 3
            Fila resultado = Merge.mergeOrdenadoFila(fila1, fila2);
            System.out.println("fila3:");
            resultado.imprimir();
            System.out.println("---------");
    }
}
