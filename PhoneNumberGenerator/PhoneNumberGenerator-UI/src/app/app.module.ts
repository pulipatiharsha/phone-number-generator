import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { PhoneNumberService } from './phone-number.service';
import { HttpClientModule }    from '@angular/common/http';
import {NgxPaginationModule} from 'ngx-pagination';
@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
	FormsModule,
	HttpClientModule,
	NgxPaginationModule
  ],
  providers: [PhoneNumberService],
  bootstrap: [AppComponent]
})
export class AppModule { }
