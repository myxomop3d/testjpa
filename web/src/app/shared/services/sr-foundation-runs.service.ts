import { Injectable } from '@angular/core';
import {Observable, of} from 'rxjs';
import {Run} from '../models/foundation/run';

@Injectable({
  providedIn: 'root'
})
export class SrFoundationRunsService {

  constructor() { }

  /*getHeroes(): Observable<Run[]> {
    // TODO: send the message _after_ fetching the heroes
    return of(Run);
  }*/
}
