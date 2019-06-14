import { Component } from '@angular/core';

@Component({
    selector: 'list-product',
    templateUrl:'./list.product.component.html',
    StyleUrls : ['./list-product.component.css']
})
export class ListProductComponent{

    products: Product[];


    display(){
        this.products = [
            new Product(1,"Nokia 6600", 5000, 99),
            new Product(2, "Sony Xperia", 15000, 99),
            new Product(3, "Samsung Note", 25000,99),
            new Product(4, "iPhone X", 35000, 99)
        ]
    }

}

export class Product {

    id : number;
    name : string;
    price : number;
    quantity : number;

    constructor(id: number, name: string, price: number, quantity: number ){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
}