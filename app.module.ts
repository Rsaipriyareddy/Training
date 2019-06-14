import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HelloComponent } from 'src/app/hello.component';
import { random1 } from 'src/app/random1.component';
import { LoginComponent } from 'src/app/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    random1,
    LoginComponent
  ],
  imports: [
    BrowserModule, 
    FormsModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
