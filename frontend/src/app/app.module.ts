import {BrowserModule} from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PagesModule } from './pages/pages.module';

import { FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
// Rutas
import { APP_ROUTES } from './app.routes';
import { ServiceModule } from './services/service.module';
import { MessageService } from 'primeng';
import { EmployerService } from './services/interface/employer.services';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    PagesModule,
    FormsModule,
    HttpClientModule,
    APP_ROUTES,
    ServiceModule
  ],
  providers: [MessageService,EmployerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
