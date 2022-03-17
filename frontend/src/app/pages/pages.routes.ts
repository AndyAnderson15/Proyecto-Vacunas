import { RouterModule, Routes } from '@angular/router';
import { PagesComponent } from './pages.component';
import { EmployerComponent } from './employer/employer.component';
import { AdminComponent } from './admin/admin.component';

const pagesRoutes: Routes = [
    {
        path: '',
        component: PagesComponent,
        children: [
            { path: 'admin', component: AdminComponent},
            { path: 'employer', component: EmployerComponent},
            { path: '', redirectTo: '/employer', pathMatch: 'full' }
        ]
    }
];

export const PAGES_ROUTES = RouterModule.forChild( pagesRoutes );
