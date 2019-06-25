import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Filme } from 'src/app/core/entities/filme/filme';
import { FilmeService } from 'src/app/core/entities/filme/filme.service';


@Injectable()
export class FilmeResolver implements Resolve<Filme []> {

    constructor(private service: FilmeService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
