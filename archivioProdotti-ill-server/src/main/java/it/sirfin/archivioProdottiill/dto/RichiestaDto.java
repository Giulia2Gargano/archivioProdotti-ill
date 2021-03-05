package it.sirfin.archivioProdottiill.dto;

import it.sirfin.archivioProdottiill.model.Prodotto;

public class RichiestaDto {

    private Prodotto prodotto;

    public RichiestaDto() {
    }

    public RichiestaDto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    @Override
    public String toString() {
        return "RichiestaDto{" + "prodotto=" + prodotto + '}';
    }

}
