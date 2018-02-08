import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject } from 'rxjs';
import { TestNpc } from '../entities/test-npc';

@Injectable()
export class TestNpcService {

  public testNPC = new BehaviorSubject<TestNpc>(null);

  constructor(private http: HttpClient) { }

  getAllTestNPCs(){
    return this.http.get<TestNpc>("http://localhost:8888" + "/all");
  }

}
