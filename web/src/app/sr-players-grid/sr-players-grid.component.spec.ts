import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatSortModule } from '@angular/material/sort';
import { MatTableModule } from '@angular/material/table';

import { SrPlayersGridComponent } from './sr-players-grid.component';

describe('SrPlayersGridComponent', () => {
  let component: SrPlayersGridComponent;
  let fixture: ComponentFixture<SrPlayersGridComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SrPlayersGridComponent ],
      imports: [
        NoopAnimationsModule,
        MatPaginatorModule,
        MatSortModule,
        MatTableModule,
      ]
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SrPlayersGridComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should compile', () => {
    expect(component).toBeTruthy();
  });
});
