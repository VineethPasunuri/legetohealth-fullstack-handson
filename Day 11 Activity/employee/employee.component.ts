import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
employees : any = [{id : 100, name : 'Henry', salary : 23000},{id : 200, name : 'Mark', salary : 89000}];
  

}
