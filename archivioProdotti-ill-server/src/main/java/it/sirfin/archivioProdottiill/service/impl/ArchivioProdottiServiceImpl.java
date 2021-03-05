package it.sirfin.archivioProdottiill.service.impl;

import it.sirfin.archivioProdottiill.dto.RispostaDto;
import it.sirfin.archivioProdottiill.model.Prodotto;
import it.sirfin.archivioProdottiill.repository.ArchivioProdottiRepository;
import it.sirfin.archivioProdottiill.service.ArchivioProdottiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArchivioProdottiServiceImpl implements ArchivioProdottiService {

    @Autowired
    ArchivioProdottiRepository archivioProdottiRepository;

    @Override
    public RispostaDto aggiungi(Prodotto prod) {
        archivioProdottiRepository.save(prod);
        return aggiorna();
    }

    @Override
    public RispostaDto aggiorna() {
        List<Prodotto> lista = archivioProdottiRepository.findAll();
        return new RispostaDto(lista);
    }

    @Override
    public RispostaDto ricerca(String stringa) {
        List<Prodotto> prod = archivioProdottiRepository.findByCodiceContainsOrDescrizioneContains(stringa, stringa);
        return new RispostaDto(prod);
    }

}
