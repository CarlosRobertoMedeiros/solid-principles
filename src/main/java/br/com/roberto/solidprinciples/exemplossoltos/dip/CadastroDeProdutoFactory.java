package br.com.roberto.solidprinciples.exemplossoltos.dip;

public class CadastroDeProdutoFactory {

    public static CatalogoDeProdutoRepository create(){
        return new SQLCatalogoDeProdutoRepository();
    }
}
