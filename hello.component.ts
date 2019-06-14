import { Component } from '@angular/core';

@Component ({   //@ called as Decorator in Angular Framework

    selector : 'hello',
    template : `
        <h1 style = "color : green">{{message}}</h1>
    `
})

export class HelloComponent{
    
    message : String ="Hii SaiPriya..This is Rafiq!";
}

