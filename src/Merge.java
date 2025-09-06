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
    public static int[] mergeOrdenadoVetor(int[] a, int tamA, int[] b, int tamB) {
        int[] c = new int[tamA + tamB];
        int i = 0; //indice de a
        int j = 0; //indice de b
        int k = 0; //indice de c

        //enquanto tiver elemnntos
        while (i < tamA && j < tamB) {
            //se for o do a
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
                i++;
            } else{ //se for o do b
                c[k++] = b[j++];
                j++;
            }
            k++;
        }

        //sobra a
        while (i < tamA) {
            c[k]  = a[i];
            i++;
            k++;
        }
        //sobra b
        while (j < tamB) {
            c[k]  = b[j];
            j++;
            k++;
        }
        return c;
    }

    //só p imprimir
    public static void imprimir(int[] l, int n){
        for (int i = 0; i < n; i++){
            System.out.print(l[i] + " ");
        }
        System.out.println(); //pula linha, n tirem isso!!
    }
}