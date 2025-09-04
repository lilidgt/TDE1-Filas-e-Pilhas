//
//  Pilha.java
//  
//
//  Created by Lissa Deguti on 04/09/25.
//

public class Pilha {
    //Definindo como um nó o topo pois ele sempre será o primeiro nó da lista
    private Node topo;
    //Para o usuário definir o tamnho da lista
    private int tamanho;

    public Pilha(){
        this.topo = null;
        this.tamanho = 0;
    }



    public void inserir(int informacao){
        //cria novo nó
        Node no = new Node();
        //insere informação no novo nó
        no.setInformacao(informacao);

        //verificar se a lsiat esta vazia
        if (topo == null){
            topo = no;
        }

        else{
            //pegamos o primeiro no atual = topo
            Node primeiro = topo;
            //definimos o proximo do no novo nó como o antigo topo
            no.setProximo(primeiro);
            //definimos o novo topo sendo o novo nó criado
            topo = no;
            tamanho ++;
        }
    }

    public void remover(){
        if (topo == null){
            System.out.println("Lista vazia");
        }
        Node proximo = topo.getProximo();
        System.out.println("Valor removido: " + topo.getInformacao());
        topo = proximo;
        tamanho--;

    }

    public void imprimir(){
        Node atual = topo;
        while (atual != null){
            System.out.print(atual.getInformacao()+ " -> ");
            atual= atual.getProximo();
        }
        System.out.println("Null");
    }




}
