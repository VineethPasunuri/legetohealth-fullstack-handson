import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-mdf-demo',
  templateUrl: './mdf-demo.component.html',
  styleUrls: ['./mdf-demo.component.css']
})
export class MdfDemoComponent {
constructor(private _builder : FormBuilder){}
profile = this._builder.group({
  firstName : [''],
  lastName : ['']
});
handleSubmit() : void{
  console.log(this.profile.value)
}
}
