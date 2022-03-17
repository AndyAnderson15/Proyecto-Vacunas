import { Component, OnInit } from '@angular/core';
import { EmployerService } from '../../services/interface/employer.services';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styles: []
})
export class AdminComponent implements OnInit {

  constructor( public employerService: EmployerService) {
  }

  displayDialog: boolean;

    employer: any = {};
    selectedEmployer: any;
    newUser: boolean;
    listEmployer: any[];
    cols: any[];

    statusSave: boolean = false;

// tslint:disable-next-line:typedef
ngOnInit() {

  this.displayDialog = false;
  this.cols = [
      { field: 'idEmpleado', header: 'Código' },
      { field: 'cedula', header: 'Cédula' },
      { field: 'nombres', header: 'Nombre' },
      { field: 'apellidos', header: 'Apellidos'},
      { field: 'correoElectronico', header: 'Email'}
  ];
  this.getEmployers();
}

  showDialogToAdd() {
    this.newUser = true;
    this.employer = {};
    this.displayDialog = true;

    this.statusSave = false;
  }

  save() {

    if(this.validateEmploye(this.employer)){
      return ;
    }
      

   if (this.newUser) {
     this.employerService.saveEmployers(this.employer).subscribe(response => {
      this.getEmployers();
     this.employer = null;
      this.displayDialog = false;
     }); 
     
   }else{
      this.employerService.updateEmployers(this.employer).subscribe(response => {
        this.getEmployers();
        this.displayDialog=false;
      });
   }
  }


  
  delete(employer: any) {
  this.employerService.deleteEmployers(employer.idEmpleado).subscribe(response => {
     this.getEmployers();
     this.employer = null;
     this.displayDialog = false;
   }); 
  }


  onRowSelect(event) {

    
    this.newUser = false;
    this.employer = this.cloneCar(event);
    this.displayDialog = true;
  }

  cloneCar(c: any): any {
    const user = {};
    for (const prop in c) {
        user[prop] = c[prop];
    }
    return user;
  }

  getEmployers() {
     this.employerService.getAllEmpleados().subscribe(response => {
        this.listEmployer = response;
      }); 
  }

  validateEmploye(employer:any) {

      this.statusSave = true;
      let cedula:string = employer.cedula;


      console.log(cedula.length);
      if (employer.cedula == null|| cedula.length >10){
          return true; 
      }if (employer.nombres == null || employer.nombres.trim() == "" ){
        return true; 
      }if (employer.apellidos == null || employer.apellidos.trim() == "" ){
        return true; 
      }if (employer.correoElectronico == null || employer.correoElectronico.trim() == "" ){
        return true; 
      }
      
      return false;
 }




 
}


