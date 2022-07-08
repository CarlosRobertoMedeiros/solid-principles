package br.com.roberto.solidprinciples.exemplossoltos.dip;

import java.util.Arrays;
import java.util.List;

public class SQLCatalogoDeProdutoRepository implements CatalogoDeProdutoRepository {
    @Override
    public List<String> listaTodos() {
        return Arrays.asList("Sabão","Pasta Dental");
    }
}
