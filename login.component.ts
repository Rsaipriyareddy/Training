import { Component } from '@angular/core';
import { templateJitUrl } from '@angular/compiler';

@Component({
    selector : 'login',
    templateUrl : `./login.component.html`
    


})
export class LoginComponent{

        username : String;  //Should be matched with the [(ngmodel)] value
        password : String;
        message  : String;

       aunthenticate(){

            if(this.username =='Shaik.Rafiq' && this.password == '123')
                    this.message = 'Valid User';
            else
                    this.message = 'Invalid Username/Password';
       } 
}