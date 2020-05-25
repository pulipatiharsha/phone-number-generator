import { TestBed, inject } from '@angular/core/testing';

import { PhoneNumberServiceService } from './phone-number-service.service';

describe('PhoneNumberServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PhoneNumberServiceService]
    });
  });

  it('should be created', inject([PhoneNumberServiceService], (service: PhoneNumberServiceService) => {
    expect(service).toBeTruthy();
  }));
});
