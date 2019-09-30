import {Component, Input, OnInit} from '@angular/core';
import {ControlPresentation, EditorFieldMeta, ValidatorKind} from './editor-field-meta';
import {FormControl, FormGroup, ValidatorFn, Validators} from '@angular/forms';
import { Location } from '@angular/common';

const FIELDS: EditorFieldMeta[] = [
  {
    name: 'fio',
    caption: 'Фамилия Имя отчечство',
    mandatory: false,
    default: '',
    control: ControlPresentation.textbox,
    valuesSource: null,
    validators: null
  },
  {
    name: 'hackerLogin',
    caption: 'Логин',
    mandatory: true,
    default: 'iddqd',
    control: ControlPresentation.textbox,
    valuesSource: null,
    validators: null
  },
];

@Component({
  selector: 'app-sr-dyn-editor',
  templateUrl: './sr-dyn-editor.component.html',
  styleUrls: ['./sr-dyn-editor.component.css']
})
export class SrDynEditorComponent implements OnInit {

  formGroup: FormGroup;
  payLoad = '';
  private metadata: EditorFieldMeta[];
  constructor(private location: Location) { }

  @Input() id: string;

  ngOnInit() {
    this.metadata = FIELDS;
    this.formGroup = this.createControls(FIELDS);
  }

  onSubmit() {
    console.log(this.formGroup.value);
    this.payLoad = JSON.stringify(this.formGroup.value);
  }

  private createControls(fields: EditorFieldMeta[]): FormGroup  {
    const controls: { [key: string]: FormControl} = {};
    const validators: ValidatorFn[] = [];

    fields.forEach(f => {
      if (f.validators) {
        f.validators.forEach(v => {
          switch (v.validator) {
            case ValidatorKind.maxLength:
              validators.push(Validators.maxLength(v.argument));
              break;
            case ValidatorKind.minLength:
              validators.push(Validators.minLength(v.argument));
              break;
            case ValidatorKind.maxValue:
              validators.push(Validators.max(v.argument));
              break;
            case ValidatorKind.minValue:
              validators.push(Validators.min(v.argument));
              break;
            case ValidatorKind.pattern:
              validators.push(Validators.min(v.argument));
              break;
            case ValidatorKind.required:
              validators.push(Validators.required);
              break;
          }
        });
      }

      let control: FormControl;
      if (validators) {
        control = new FormControl(f.default, validators);
      } else {
        control = new FormControl();
      }

      controls[f.name] = control;
    });

    return new FormGroup(controls);
  }

  getErrorMessage() {
    return 'someshit happened';
  }

  onCancel() {
    this.location.back();
  }
}
