import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-mdf-validation',
  templateUrl: './mdf-validation.component.html',
  styleUrls: ['./mdf-validation.component.css']
})
export class MdfValidationComponent {
  constructor(private _router: Router, private _builder: FormBuilder) { }
  profile = this._builder.group({
    firstName: ['', Validators.compose([Validators.required, Validators.minLength(3)])],
    lastName: ['', Validators.compose([Validators.required, Validators.minLength(3)])]
  });
  handleSubmit(): void {
    let firstname = this.profile.controls['firstName'].value;
    // Hardcode way of Authenticating though this is not a right way of authenticating
    if (firstname == 'Alex') {
      sessionStorage.setItem('user', firstname)
      this._router.navigate(['success', firstname])
    }
    else {
      this._router.navigate(['tdf'])
      this.profile.reset({});
    }
    // console.log(this.profile.value);
  }
}
