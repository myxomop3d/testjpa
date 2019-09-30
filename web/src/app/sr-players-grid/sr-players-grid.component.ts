import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatButton } from '@angular/material/button';
import { MatSort } from '@angular/material/sort';
import { MatTable } from '@angular/material/table';
import { SrPlayersGridDataSource, SrPlayersGridItem } from './sr-players-grid-datasource';

@Component({
  selector: 'app-sr-players-grid',
  templateUrl: './sr-players-grid.component.html',
  styleUrls: ['./sr-players-grid.component.css']
})
export class SrPlayersGridComponent implements AfterViewInit, OnInit {
  @ViewChild(MatPaginator, {static: false}) paginator: MatPaginator;
  @ViewChild(MatSort, {static: false}) sort: MatSort;
  @ViewChild(MatTable, {static: false}) table: MatTable<SrPlayersGridItem>;
  dataSource: SrPlayersGridDataSource;

  /** Columns displayed in the table. Columns IDs can be added, removed, or reordered. */
  displayedColumns = ['id', 'name'];

  ngOnInit() {
    this.dataSource = new SrPlayersGridDataSource();
  }

  ngAfterViewInit() {
    this.dataSource.sort = this.sort;
    this.dataSource.paginator = this.paginator;
    this.table.dataSource = this.dataSource;
  }
}
