import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Prodotto } from './prodotto';
import { RichiestaDto } from './richiesta-dto';
import { RispostaDto } from './risposta-dto';

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
    //preparo il REST
    let ox = this.http.post<RispostaDto>("http://localhost:8080/aggiungi", dto);
    ox.subscribe(r =>
      this.prodotti = r.listaProdotti
    );
  }

  ricerca() { }

  aggiorna() { }

  rimuovi() { }

  calcolaSconto() { }


}

