import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SrFoundationRunsComponent } from './sr-foundation-runs.component';

describe('SrFoundationRunsComponent', () => {
  let component: SrFoundationRunsComponent;
  let fixture: ComponentFixture<SrFoundationRunsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SrFoundationRunsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SrFoundationRunsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
