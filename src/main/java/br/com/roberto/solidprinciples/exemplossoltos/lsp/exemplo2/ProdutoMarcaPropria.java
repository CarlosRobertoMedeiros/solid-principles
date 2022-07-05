package br.com.roberto.solidprinciples.exemplossoltos.lsp.exemplo2;

public class ProdutoMarcaPropria extends Produto{


    @Override
    public double getDesconto() {
        this.aplicaDescontoExtra();
        return desconto;
    }

    public void aplicaDescontoExtra(){
        this.desconto = desconto * 1.5;
    }

}
