import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <!--The content below is only a placeholder and can be replaced.-->
    <div style="text-align:center">
      <h1>
        Welcome to {{title}}!
      </h1>
      <h1>
      <hello></hello>
      </h1>
      <h1>
      <random></random>
      </h1>
      
      <login></login>
      <img width="350" src="https://11m5ki43y82budjol1gjvv5s-wpengine.netdna-ssl.com/wp-content/uploads/2018/10/angular-virtual-scroll-drag-drop-main.jpg">
    </div>
    <h2>Here are some links to help you start: </h2>
    <ul>
      <li>
        <h2><a target="_blank" rel="noopener" href="https://angular.io/tutorial">Tour of Heroes</a></h2>
      </li>
      <li>
        <h2><a target="_blank" rel="noopener" href="https://angular.io/cli">CLI Documentation</a></h2>
      </li>
      <li>
        <h2><a target="_blank" rel="noopener" href="https://blog.angular.io/">Angular blog</a></h2>
      </li>
    </ul>
    
    
  `,
  styles: []
})
export class AppComponent {
  title = 'app1';
}
