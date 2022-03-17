import { Component, OnInit } from '@angular/core';
import { MenuModule } from 'primeng/menu';
import { MenuItem } from 'primeng/api';
import { MegaMenuItem } from 'primeng/api';

@Component({
  selector: 'app-pages',
  templateUrl: './pages.component.html',
  styles: []
})
export class PagesComponent implements OnInit {

  items: MenuItem[];

  constructor() { }

  // tslint:disable-next-line:typedef
  ngOnInit() {
    this.items = [
      { label: 'Administrador', icon: 'pi pi-user-edit', routerLink: ['/admin'] },
      { label: 'Empleado', icon: 'pi pi-user-edit', routerLink: ['/employer'] }
    ];
  }

}
