import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ator } from 'src/app/core/entities/ator/ator';
import { AtorService } from 'src/app/core/entities/ator/ator.service';


@Injectable()
export class AtorResolver implements Resolve<Ator []> {

    constructor(private service: AtorService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
