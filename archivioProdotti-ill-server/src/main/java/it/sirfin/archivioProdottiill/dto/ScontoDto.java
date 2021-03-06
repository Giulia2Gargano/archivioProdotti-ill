/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioProdottiill.dto;

/**
 *
 * @author Palo
 */
public class ScontoDto {

    private double prezzoScontato;

    public ScontoDto() {
    }

    public ScontoDto(double prezzoScontato) {
        this.prezzoScontato = prezzoScontato;
    }

    public double getPrezzoScontato() {
        return prezzoScontato;
    }

    public void setPrezzoScontato(double prezzoScontato) {
        this.prezzoScontato = prezzoScontato;
    }

    @Override
    public String toString() {
        return "ScontoDto{" + "prezzoScontato=" + prezzoScontato + '}';
    }

}
