package it.sirfin.archivioProdottiill.controller;

import it.sirfin.archivioProdottiill.dto.RicercaDto;
import it.sirfin.archivioProdottiill.dto.RichiestaDto;
import it.sirfin.archivioProdottiill.dto.RispostaDto;
import it.sirfin.archivioProdottiill.dto.ScontoDto;
import it.sirfin.archivioProdottiill.service.ArchivioProdottiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ArchivioProdottiController {

    @Autowired
    ArchivioProdottiService archivioProdottiService;

    @RequestMapping("/aggiungi")
    @ResponseBody

    public RispostaDto aggiungi(@RequestBody RichiestaDto dto) {
        return archivioProdottiService.aggiungi(dto.getProdotto());
    }

    @RequestMapping("/aggiorna")
    @ResponseBody
    public RispostaDto aggiorna(@RequestBody RicercaDto dto) {
        return archivioProdottiService.aggiornaFiltrato(dto.getRicerca());
    }

    @RequestMapping("/ricerca")
    @ResponseBody
    public RispostaDto ricerca(@RequestBody RicercaDto stringa) {
        return archivioProdottiService.ricerca(stringa.getRicerca());
    }

    @RequestMapping("/rimuovi")
    @ResponseBody
    public RispostaDto rimuovi(@RequestBody RichiestaDto dto) {
        return archivioProdottiService.rimuovi(dto.getProdotto());
    }

    @RequestMapping("/sconto")
    @ResponseBody
    public ScontoDto sconto(@RequestBody RichiestaDto dto) {
        return archivioProdottiService.sconto(dto.getProdotto());
    }

}
