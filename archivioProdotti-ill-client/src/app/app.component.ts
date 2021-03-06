import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Prodotto } from './prodotto';
import { RicercaDto } from './ricerca-dto';
import { RichiestaDto } from './richiesta-dto';
import { RispostaDto } from './risposta-dto';
import { ScontoDto } from './sconto-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  prodotto = new Prodotto();
  prodotti: Prodotto[] = [];
  search = "";
  sconto = 0;
  constructor(private http: HttpClient) { }

  aggiungi() {
    //dati da inviare al server
    let dto = new RichiestaDto();
    dto.prodotto = this.prodotto;
    dto.prodotto.prezzoIVA = dto.prodotto.prezzo * 1.22;
    //preparo il REST
    let ox = this.http.post<RispostaDto>("http://localhost:8080/aggiungi", dto);
    ox.subscribe(r => {
      this.prodotti = r.listaProdotti
    });
    this.prodotto = new Prodotto();
    this.search = "";
  }

  ricerca() {
    let ric = new RicercaDto();
    ric.ricerca = this.search;
    this.http.post<RispostaDto>("http://localhost:8080/ricerca", ric)
      .subscribe(r => {
        this.prodotti = r.listaProdotti;
      });
  }

  aggiorna() {
    let ric = new RicercaDto();
    ric.ricerca = this.search;
    this.http.post<RispostaDto>("http://localhost:8080/aggiorna", ric)
      .subscribe(r =>
        this.prodotti = r.listaProdotti
      );
  }

  rimuovi(p: Prodotto) {
    let rim = new RichiestaDto();
    rim.prodotto = p;
    this.http.post<RispostaDto>("http://localhost:8080/rimuovi", rim)
      .subscribe(r =>
        this.prodotti = r.listaProdotti
      );
  }

  calcolaSconto(p: Prodotto) {
    let scon = new RichiestaDto();
    scon.prodotto = p;
    this.http.post<ScontoDto>("http://localhost:8080/sconto", scon)
      .subscribe(r =>
        this.sconto = r.prezzoScontato
      );
  }
}

