import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { MessageService } from 'primeng/components/common/messageservice';
import { AtorDto } from './ator-dto';
import { EntityService } from '../entity-service';
import { FilmeDto } from '../filme/filme-dto';


@Injectable()
export class AtorService extends EntityService<AtorDto> {

    constructor(protected http: HttpClient, protected messageService: MessageService) {
        super(
            http,
            `https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/entities/ator`
        );
    }

    public retornaFilmesByAtor(nomeAtor) {    
        return this.http.post<FilmeDto[]>('https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/queries/retornaFilmesByAtor', {ator: nomeAtor}, { headers: this.headers }).pipe(this.defaultCatch());
      }
}
