import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent {
  username: string = "John";
  username2: string = "";
  toggleButton: boolean = false;
  handleClick(): void {
    this.username = "Steven";
  }
  handleClick2(u: string): void {
    this.username2 = u;
    this.toggleButton = !this.toggleButton;
  }


}
