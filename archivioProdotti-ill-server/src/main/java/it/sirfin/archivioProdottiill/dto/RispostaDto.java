package it.sirfin.archivioProdottiill.dto;

import it.sirfin.archivioProdottiill.model.Prodotto;
import java.util.List;

public class RispostaDto {

    private List<Prodotto> listaProdotti;

    public RispostaDto() {
    }

    public RispostaDto(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    @Override
    public String toString() {
        return "RispostaDto{" + "listaProdotti=" + listaProdotti + '}';
    }

}
