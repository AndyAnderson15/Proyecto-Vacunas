
import { NgModule, CUSTOM_ELEMENTS_SCHEMA  } from '@angular/core';
import { PAGES_ROUTES } from './pages.routes';
import { FormsModule } from '@angular/forms';


// ng2-charts
import { PagesComponent } from './pages.component';
import { EmployerComponent } from './employer/employer.component';
import { AdminComponent } from './admin/admin.component';

// temporal
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { TableModule } from 'primeng/table';
import { ButtonModule } from 'primeng/button';
import { CommonModule } from '@angular/common';
import { DialogModule } from 'primeng/dialog';
import { DropdownModule, MenuModule } from 'primeng';
import {MessagesModule} from 'primeng/messages';
import {MessageModule} from 'primeng/message';

@NgModule({
    declarations: [
        PagesComponent,
        EmployerComponent,
        AdminComponent
    ],
    exports: [
        EmployerComponent,
        AdminComponent
    ],
    imports: [
        BrowserAnimationsModule,
        PAGES_ROUTES,
        FormsModule,
        TableModule,
        ButtonModule,
        CommonModule,
        DialogModule,
        MenuModule,
        DropdownModule,
        MessagesModule,
        MessageModule
    ],
    schemas: [ CUSTOM_ELEMENTS_SCHEMA ]
})

export class PagesModule { }
