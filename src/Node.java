//
//  Node.java
//  
//
//  Created by Lissa Deguti on 04/09/25.
//

//
//  Node.java
//
//
//  Created by Lissa Deguti on 04/09/25.
//

public class Node {
    private Integer informacao;
    private Node proximo;

    public Node(){
        this.informacao = null;
        this.proximo = null;
    }

    public Integer getInformacao(){
        return informacao;
    }

    public void setInformacao(Integer informacao){
        this.informacao = informacao;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

}
