import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tdf-validation',
  templateUrl: './tdf-validation.component.html',
  styleUrls: ['./tdf-validation.component.css']
})
export class TdfValidationComponent {
  handleSubmit(data: any): void {
    console.log(data);
  }
}
