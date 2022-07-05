package br.com.roberto.solidprinciples.exemplossoltos.lsp.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class PricingUtils {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new ProdutoMarcaPropria();

        List<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);


        //Usei o LSP do para Tell dont Ask(Diga, não pergunte)
        // Mesma idéia da outra substituição
        //O produto de marca própria implementa o método getDesconto
        // e ele modifica o comportamento interno do aplicaDescontoExtra
        //Essa substituição permitiu fazer com que ambos os métodos da interface pudessem ser alternados.
        for (Produto produto: listaDeProdutos){
//            if (produto instanceof ProdutoMarcaPropria){
//                ((ProdutoMarcaPropria)produto).aplicaDescontoExtra();
//            }
            System.out.println(produto.getDesconto());
        }





    }
}
