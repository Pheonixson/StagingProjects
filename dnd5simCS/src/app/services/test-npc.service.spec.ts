import { TestBed, inject } from '@angular/core/testing';

import { TestNpcService } from './test-npc.service';

describe('TestNpcService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TestNpcService]
    });
  });

  it('should be created', inject([TestNpcService], (service: TestNpcService) => {
    expect(service).toBeTruthy();
  }));
});
