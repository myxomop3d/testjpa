import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { AppSrHomeComponent } from './app-sr-home/app-sr-home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule, MatFormFieldModule, MatInputModule, MatMenuModule} from '@angular/material';
import { ReactiveFormsModule } from '@angular/forms';
import { SrPlayersGridComponent } from './sr-players-grid/sr-players-grid.component';
import { MatTableModule } from '@angular/material/table';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatSortModule } from '@angular/material/sort';
import { SrDynEditorComponent } from './sr-dyn-editor/sr-dyn-editor.component';
import { SrFoundationRunsComponent } from './sr-foundation-runs/sr-foundation-runs.component';


const appRoutes: Routes = [
  { path: 'start', component: AppSrHomeComponent,  },
  { path: 'players', component: SrPlayersGridComponent,  },
  { path: 'players/new', component: SrDynEditorComponent,  },
  { path: 'foundation/runs', component: SrFoundationRunsComponent,  },
  { path: '**', component: PageNotFoundComponent }
];


@NgModule({
  declarations: [
    AppComponent,
    AppSrHomeComponent,
    PageNotFoundComponent,
    SrPlayersGridComponent,
    SrDynEditorComponent,
    SrFoundationRunsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(
      appRoutes,
      {enableTracing: true} // <-- debugging purposes only
    ),
    BrowserAnimationsModule,
    MatMenuModule,
    MatButtonModule,
    MatTableModule,
    MatPaginatorModule,
    MatSortModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
