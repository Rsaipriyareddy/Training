import { Component } from '@angular/core';

@Component ({   //@ called as Decorator in Angular Framework

    selector : 'random',
    template : `
   
    
        <button (click)="generate()" style = "background  : skyblue" >Please Click Here</button>
        <h2 *ngIf = "randomnumber" style = "color : blue">My Random Number is {{randomnumber}}</h2>
    `
})

export class random1{
    
       randomnumber : number;

       generate(){
            this.randomnumber = Math.ceil(Math.random()*100);
       }
}
