package it.sirfin.archivioProdottiill.service.impl;

import it.sirfin.archivioProdottiill.dto.RispostaDto;
import it.sirfin.archivioProdottiill.dto.ScontoDto;
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
    public RispostaDto ricerca(String ricerca) {
        List<Prodotto> prod = archivioProdottiRepository.findByCodiceContainsOrDescrizioneContains(ricerca, ricerca);
        return new RispostaDto(prod);
    }

    @Override
    public RispostaDto rimuovi(Prodotto prod) {
        archivioProdottiRepository.delete(prod);
        return aggiorna();
    }

    @Override
    public ScontoDto sconto(Prodotto prod) {
        double sc = prod.getPrezzo() * 0.7;
        return new ScontoDto(sc);
    }

    @Override
    public RispostaDto aggiornaFiltrato(String ricerca) {
        List<Prodotto> l = archivioProdottiRepository.findByCodiceContainsOrDescrizioneContains(ricerca, ricerca);
        return new RispostaDto(l);
    }

}
