package br.com.roberto.solidprinciples.exemplossoltos.ocp.interactors;

public class SeguroSaude implements PerfilCliente {
    @Override
    public boolean isClienteLeal() {
        return true;
    }
}
