import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent {
  name: string = 'Peter';
  salary: number = 38000;
  dob: Date = new Date(2000, 3, 13);
  fruits : any = ["orrange", "Apple", "Mango"];
  status : boolean = true;
}
