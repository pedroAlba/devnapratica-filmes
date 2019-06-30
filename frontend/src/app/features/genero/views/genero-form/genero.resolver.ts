import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ator } from 'src/app/core/entities/ator/ator';
import { AtorService } from 'src/app/core/entities/ator/ator.service';
import { Diretor } from 'src/app/core/entities/diretor/diretor';
import { DiretorService } from 'src/app/core/entities/diretor/diretor.service';
import { Genero } from 'src/app/core/entities/genero/genero';
import { DiretorResolver } from 'src/app/features/diretor/views/diretor-form/diretor.resolver';
import { GeneroService } from 'src/app/core/entities/genero/genero.service';


@Injectable()
export class GeneroResolver implements Resolve<Genero []> {

    constructor(private service: GeneroService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
