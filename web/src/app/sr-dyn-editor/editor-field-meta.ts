
export enum ControlPresentation {
  textbox = 1,
  combo,
  datepicker,
}

export enum ValidatorKind {
  required,
  minValue,
  maxValue,
  minLength,
  maxLength,
  pattern
}

export interface ValidatorMeta {
  validator: ValidatorKind;
  argument: any;
  message: string;
}

export interface EditorFieldMeta {
  name: string;
  caption: string;
  mandatory: boolean;
  default: any;
  control: ControlPresentation;
  valuesSource: string;
  validators: Array<ValidatorMeta>;
}
