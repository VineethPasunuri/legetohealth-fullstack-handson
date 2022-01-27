import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  @Input()
  username = "Roger";
  @Output()
  eventCounter: EventEmitter<number> = new EventEmitter<number>();
  counter: number = 0;
  incrementCounter() {
    this.counter = this.counter + 1;
    this.eventCounter.emit(this.counter);
  }
}
