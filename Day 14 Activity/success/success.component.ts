import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-success',
  templateUrl: './success.component.html',
  styleUrls: ['./success.component.css']
})
export class SuccessComponent implements OnInit {
  // initialise this through root parameter
  username: any = undefined;
  constructor(private _activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this._activatedRoute.params.subscribe((p: Params) => {
      this.username = p['un'];
    })
  }

}
