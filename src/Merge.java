public class Merge {

    //fila
    public static Fila mergeOrdenadoFila(Fila f1, Fila f2) {
        Fila f3 = new Fila();

        //enquanto as 2 filas tiverem numeros
        while (!f1.vazia() && !f2.vazia()) {
            //pega os da frente
            int a = f1.frente();
            int b = f2.frente();

            //compara os da frente
            if (a <= b) {
                f3.inserir(a);
                f1.remover(); //tem q tirar p a fila andar
            } else {
                f3.inserir(b);
                f2.remover();
            }
        }

        //e se sobram numeros
        while (!f1.vazia()) {
            f3.inserir(f1.frente());
            f1.remover();
        }
        while (!f2.vazia()) {
            f3.inserir(f2.frente());
            f2.remover();
        }

        return f3;
    }

    //vetor
    

}