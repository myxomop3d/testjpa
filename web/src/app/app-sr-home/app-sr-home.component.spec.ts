import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppSrHomeComponent } from './app-sr-home.component';

describe('AppSrHomeComponent', () => {
  let component: AppSrHomeComponent;
  let fixture: ComponentFixture<AppSrHomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppSrHomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppSrHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
