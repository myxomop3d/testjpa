import { Injectable } from '@angular/core';
import {Observable, of} from 'rxjs';
import {Run} from '../models/foundation/run';
import {RUNS} from '../models/foundation/mock-runs';

@Injectable({
  providedIn: 'root'
})
export class SrFoundationRunsService {

  constructor() { }

  getHeroes(): Observable<Run[]> {
    // TODO: send the message _after_ fetching the heroes
    return of(RUNS);
  }
}
