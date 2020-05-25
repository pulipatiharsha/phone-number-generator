import { Component } from '@angular/core';

import { PhoneNumberService } from './phone-number.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  phoneNumber: any = '';
  phoneNumbers: any ;
  p: number = 1;
  constructor( private phoneNumberService: PhoneNumberService) { }
  generatePhoneNumbers(){
  this.phoneNumberService.generateNumbers(this.phoneNumber).subscribe(result =>{
  this.phoneNumbers = result;
  });
  }
}
