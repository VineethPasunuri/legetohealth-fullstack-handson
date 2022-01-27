import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GenderpipeImplementationComponent } from './genderpipe-implementation.component';

describe('GenderpipeImplementationComponent', () => {
  let component: GenderpipeImplementationComponent;
  let fixture: ComponentFixture<GenderpipeImplementationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GenderpipeImplementationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GenderpipeImplementationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
