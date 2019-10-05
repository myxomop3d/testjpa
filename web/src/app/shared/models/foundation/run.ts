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

class RoomMeta {
  number: number;
}

class RoomInstance {
  meta: RoomMeta;
  state: RoomState;
}

class MatrixHost {
  name: string;
  rooms: Array<RoomInstance>;
}

class MatrixRunner {
  name: string;
}

export interface Run {
  state: RunState;
  host: MatrixHost;
  validators: Array<MatrixRunner>;
}
