export enum RunState {
  pending,
  active,
  finished,
}

export enum RoomState {
  ready,
  busy,
  waitMaster,
}

export interface RoomMeta {
  number: number;
}

export interface RoomInstance {
  meta: RoomMeta;
  state: RoomState;
}

export interface MatrixHost {
  name: string;
  rooms: Array<RoomInstance>;
}

export interface MatrixRunner {
  name: string;
}

export interface Run {
  state: RunState;
  host: MatrixHost;
  runners: Array<MatrixRunner>;
}
