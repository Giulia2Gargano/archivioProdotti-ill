/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.archivioProdottiill.service;

import it.sirfin.archivioProdottiill.dto.RichiestaDto;
import it.sirfin.archivioProdottiill.dto.RispostaDto;
import it.sirfin.archivioProdottiill.model.Prodotto;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Hp
 */
public interface ArchivioProdottiService {
    
    RispostaDto aggiungi(Prodotto prod);
    
    RispostaDto aggiorna();
    
    RispostaDto ricerca(String ricerca);
    
    RispostaDto rimuovi(Prodotto prod);
}
