package it.sirfin.archivioProdottiill.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prodotto implements Serializable {

    @Id
    @GeneratedValue
    private Long Id;

    @Column
    private String codice;
    @Column
    private String descrizione;
    @Column
    private double prezzo;
    @Column
    private double prezzoIVA;

    public Prodotto() {
    }

    public Prodotto(String codice, String descrizione, double prezzo, double prezzoIVA) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.prezzoIVA = prezzoIVA;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getPrezzoIVA() {
        return prezzoIVA;
    }

    public void setPrezzoIVA(double prezzoIVA) {
        this.prezzoIVA = prezzoIVA;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "Id=" + Id + ", codice=" + codice + ", descrizione=" + descrizione + ", prezzo=" + prezzo + ", prezzoIVA=" + prezzoIVA + '}';
    }

  
}
