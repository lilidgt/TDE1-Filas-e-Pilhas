//
//  Pilha.java
//  
//
//  Created by Lissa Deguti on 04/09/25.
//

public class Pilha {
    //Definindo como um nó o topo pois ele sempre será o primeiro nó da lista
    private Node topo;

    public Pilha(){
        this.topo = null;
    }



    public void inserir(int informacao){
        //cria novo nó
        Node no = new Node();
        //insere informação no novo nó
        no.setInformacao(informacao);

        //Se a lista estiver vazia insere o novo nó
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

        }
    }

    public void remover(){

        //verifica se a lista esta vazia
        if (topo == null){
            System.out.println("Lista vazia");
        }
        //Pega o proximo no
        Node proximo = topo.getProximo();
        //Só um print pra mostrar o valor que foi removido
        System.out.println("Valor removido: " + topo.getInformacao());
        //Removemos o valor definido o novo topo
        topo = proximo;


    }

    //Imprime a pilha
    public void imprimir(){
        Node atual = topo;
        while (atual != null){
            System.out.print(atual.getInformacao()+ " -> ");
            atual= atual.getProximo();
        }
        System.out.println("Null");
    }




}
