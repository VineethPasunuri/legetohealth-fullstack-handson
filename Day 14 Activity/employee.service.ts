import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

//This Object is available from root component
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  // baseUrl = 'http://localhost:9090'
  baseUrl = 'http://localhost:9090'
  constructor(private _client: HttpClient) { }
  fetchEmployees(): Observable<any> {
    let url = `${this.baseUrl}/employee`;
    return this._client.get(url);
  }
  store(employeeData: any): Observable<any> {
    // console.log("Store method present Inside Service");
    let url = ``; // Need to complete this
    return this._client.post(url, employeeData);
  }
  fetchEmployeeById(id: number): Observable<any> {
    let url = `${this.baseUrl}/employee/${id}`
    return this._client.get(url);
  }
  updateSalary(empId: number, salary: number): Observable<any> {
    let url = `${this.baseUrl}/em` // Need to complete
    return this._client.put(url, undefined); // put 2nd arg is body
  }
}
