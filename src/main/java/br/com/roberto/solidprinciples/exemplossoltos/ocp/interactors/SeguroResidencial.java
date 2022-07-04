package br.com.roberto.solidprinciples.exemplossoltos.ocp.interactors;

public class SeguroResidencial implements PerfilCliente {
    @Override
    public boolean isClienteLeal() {
        return true;
    }
}
