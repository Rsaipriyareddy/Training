import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
    

@Component({
    selector : 'calculator',
    templateUrl : `./calculate.component.html`
    


})
export class CalculateComponent{

        firstnumber  : number;  //Should be matched with the [(ngmodel)] value
        secondnumber : number;
        result       : number;

       calculate(){
            if(this.firstnumber > this.secondnumber){
                this.result = (this.firstnumber + this.secondnumber);
                
            }
            else{
                this.result = (this.firstnumber - this.secondnumber);
            }
           
       } 
}