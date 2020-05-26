import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import {Observable} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class PhoneNumberService {

  constructor( private http: HttpClient) { }
 
  generateNumbers(phoneNumber: any): Observable<any>{
  return this.http.get('http://localhost:8080/phoneNumber/generate',{headers: {'Content-Type': 'application/json'}, params: {'phoneNumber': phoneNumber}});
  }
}
