import { TestBed } from '@angular/core/testing';

import { SrFoundationRunsService } from './sr-foundation-runs.service';

describe('SrFoundationRunsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SrFoundationRunsService = TestBed.get(SrFoundationRunsService);
    expect(service).toBeTruthy();
  });
});
