import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TdfValidationComponent } from './tdf-validation.component';

describe('TdfValidationComponent', () => {
  let component: TdfValidationComponent;
  let fixture: ComponentFixture<TdfValidationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TdfValidationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TdfValidationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
