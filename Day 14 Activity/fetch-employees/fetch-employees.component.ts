import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-fetch-employees',
  templateUrl: './fetch-employees.component.html',
  styleUrls: ['./fetch-employees.component.css']
})
export class FetchEmployeesComponent implements OnInit {

  constructor(private _service: EmployeeService) { }
  // called after the constructor
  employees: any = undefined;
  ngOnInit(): void {
    this._service.fetchEmployees().subscribe(response => this.employees = response)
  }

}
