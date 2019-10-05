import {RoomState, Run, RunState} from './run';

export const RUNS: Run[] = [
  {
    host:
      {
        name: 'Irkutsk-prime-dns',
        rooms: [
          {
            meta:
              {
                number: 18
              },
            state: RoomState.ready
          },
          {
            meta:
              {
                number: 3
              },
            state: RoomState.waitMaster
          },
          {
            meta:
              {
                number: 7
              },
            state: RoomState.busy
          },
        ]
      },
    runners: [
        {
          name: '@Beeg-deek'
        },
        {
          name: '@haloKwin'
        },
        {
          name: '@TraDJektor'
        },
      ],
    state: RunState.pending
  },
  {
    host:
      {
        name: 'Holy Grail hospital',
        rooms: [
          {
            meta:
              {
                number: 1
              },
            state: RoomState.ready
          },
          {
            meta:
              {
                number: 3
              },
            state: RoomState.waitMaster
          },
          {
            meta:
              {
                number: 7
              },
            state: RoomState.ready
          },
        ]
      },
    runners: [
      {
        name: '@QrissTeena'
      },
      {
        name: '@roqqy'
      },
      {
        name: '@e33t'
      },
    ],
    state: RunState.finished
  }
];
