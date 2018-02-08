import { Component, OnInit } from '@angular/core';
import { TestNpcService } from '../../services/test-npc.service';

@Component({
  selector: 'app-game-character',
  templateUrl: './game-character.component.html',
  styleUrls: ['./game-character.component.css']
})
export class GameCharacterComponent implements OnInit {

  constructor(private service: TestNpcService) { }

  ngOnInit() {
  }

}
