import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MdfValidationComponent } from './mdf-validation.component';

describe('MdfValidationComponent', () => {
  let component: MdfValidationComponent;
  let fixture: ComponentFixture<MdfValidationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MdfValidationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MdfValidationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
