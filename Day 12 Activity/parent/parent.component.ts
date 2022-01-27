import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent {
  firstname = "peter";
  users = ["Sachin", "Virat", "Rohith"];
  clicks: number = 0;
  numberOfClicks(value : number) {
    this.clicks = this.clicks + 1;
  }
}
