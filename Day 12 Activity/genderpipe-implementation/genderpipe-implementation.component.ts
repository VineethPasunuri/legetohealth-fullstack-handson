import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-genderpipe-implementation',
  templateUrl: './genderpipe-implementation.component.html',
  styleUrls: ['./genderpipe-implementation.component.css']
})
export class GenderpipeImplementationComponent {
  players: any = [{ name: "sachin", gender: "Male" }, { name: "Smrithi", gender: "Female" }, { name: "Dravid", gender: "Male" }, { name: "Mithali", gender: "Female" }];

}
