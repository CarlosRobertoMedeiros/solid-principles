package br.com.roberto.solidprinciples.exemplossoltos.dip;

import java.util.List;

public class CatalogoDeProduto {
    public void listarTodos(){
        CatalogoDeProdutoRepository catalogoDeProdutoRepository = CadastroDeProdutoFactory.create();
        List<String> todosProdutosCatalogo = catalogoDeProdutoRepository.listaTodos();
        todosProdutosCatalogo.stream().forEach(System.out::println);
    }
}
