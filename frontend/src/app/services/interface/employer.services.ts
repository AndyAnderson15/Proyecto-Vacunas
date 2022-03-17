import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { of, Observable } from 'rxjs';
import { URL } from '../../common/url.services';

@Injectable()
export class EmployerService {

  constructor(private http: HttpClient) { }

  url = URL;

  public getAllEmpleados(): Observable<any>{
    return this.http.get('http://localhost:8080/api/empleado/listall');
  }

  public saveEmployers(obj: any): Observable<any> {
    return this.http.post(`${this.url.CONTEXT}${this.url.CONTEXT_EMPLOYER}${this.url.EMPLOYER.SAVE}`,obj);
  }

  public deleteEmployers(idEmpleado): Observable<any> {
    return  this.http.delete(`${this.url.CONTEXT}${this.url.CONTEXT_EMPLOYER}${this.url.EMPLOYER.DELETE}/${idEmpleado}`);
  }


  public updateEmployers(obj: any): Observable<any> {

  return this.http.post('http://localhost:8080/api/empleado/update',obj);
  }



}
