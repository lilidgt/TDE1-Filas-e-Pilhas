public class Fila {
    //indice primeiro elemento
    private Node primeiro;
    //indice ultimo elemento
    private Node ultimo;

    public Fila (){
        this.primeiro = null;
        this.ultimo = null;
    }

    public void inserir(int informacao){
        Node no = new Node();
        no.setInformacao(informacao);
        if (primeiro == null){
            primeiro = no;
            ultimo = no;
        }

        else{
            //ultimo aponta para o nó que foi criado
             ultimo.setProximo(no);
             //agora o novo nó vai ser o último
             ultimo = no;

        }
    }

    public void remover(){
        //Verificar se a lista está vazia antes
        if (primeiro == null){
            System.out.println("Lista vazia");
        }
        else{
            //pegando o proximo valor do primeiro
            Node proximo = primeiro.getProximo();
            //definindo o novo primeiro
            primeiro = proximo;
            //caso o primeiro ficar vazio depois várias remoções o ultimo passa a ser null;
            if( primeiro == null){
                ultimo = null;
            }
        }
    }

    public void imprimir(){
        Node atual = primeiro;
        if(primeiro == null){
            System.out.println("FILA VAZIA!");
            return;
        }
        System.out.print("PRIMEIRO-> ");
        while (atual != null){
            System.out.print("[" + atual.getInformacao() + "]");
            atual= atual.getProximo();
        }
        System.out.println(" <-ÚLTIMO");
    }

}
