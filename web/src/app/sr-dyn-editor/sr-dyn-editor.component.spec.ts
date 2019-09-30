import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SrDynEditorComponent } from './sr-dyn-editor.component';

describe('SrDynEditorComponent', () => {
  let component: SrDynEditorComponent;
  let fixture: ComponentFixture<SrDynEditorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SrDynEditorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SrDynEditorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
