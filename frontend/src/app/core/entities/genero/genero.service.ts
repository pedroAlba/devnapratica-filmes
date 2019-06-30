import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { MessageService } from 'primeng/components/common/messageservice';
import { GeneroDto } from './genero-dto';
import { EntityService } from '../entity-service';
import { FilmeDto } from '../filme/filme-dto';

@Injectable()
export class GeneroService extends EntityService<GeneroDto> {

  constructor(protected http: HttpClient, protected messageService: MessageService) {
    super(
      http,
      `https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/entities/genero`
    );
  }

  public retornaFilmesByGenero(nomeGenero) {    
    return this.http.post<FilmeDto[]>('https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/queries/retornaFilmesByGenero', {genero: nomeGenero}, { headers: this.headers }).pipe(this.defaultCatch());
  }
}
