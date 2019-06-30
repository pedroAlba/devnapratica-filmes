import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { MessageService } from 'primeng/components/common/messageservice';
import { DiretorDto } from './diretor-dto';
import { EntityService } from '../entity-service';
import { Observable } from 'rxjs';
import { FilmeDto } from '../filme/filme-dto';


@Injectable()
export class DiretorService extends EntityService<DiretorDto> {

  constructor(protected http: HttpClient, protected messageService: MessageService) {
    super(
      http,
      `https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/entities/diretor`
    );
  }

  public retornaFilmesByDiretor(nomeDiretor) {    
    return this.http.post<FilmeDto[]>('https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/queries/retornaFilmesByDiretor', {diretor: nomeDiretor}, { headers: this.headers }).pipe(this.defaultCatch());
  }
}
