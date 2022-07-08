package br.com.roberto.solidprinciples.exemplossoltos.dip;

public class Client {
    public static void main(String[] args) {

        CatalogoDeProduto catalogoDeProduto = new CatalogoDeProduto();
        catalogoDeProduto.listarTodos();

    }
}
