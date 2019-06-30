import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ator } from 'src/app/core/entities/ator/ator';
import { AtorService } from 'src/app/core/entities/ator/ator.service';
import { Diretor } from 'src/app/core/entities/diretor/diretor';
import { DiretorService } from 'src/app/core/entities/diretor/diretor.service';


@Injectable()
export class DiretorResolver implements Resolve<Diretor []> {

    constructor(private service: DiretorService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
