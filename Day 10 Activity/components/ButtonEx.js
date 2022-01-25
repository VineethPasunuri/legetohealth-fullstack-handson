import React, { Component } from "react";
export class ButtonEx extends React.Component {
    constructor(props) {
        super(props);
    }
    handleButton = (event) => {
        console.log('button 2 pressed');
        console.log(event);
    }
    printButton = (event) => {
        <div>
            <h2>Button1 pressed</h2>
        </div>
    }
    render() {
        return (<div>
            <button onClick={this.printButton}>Button1</button>
            <button onClick={this.handleButton}>Button2</button>
        </div>)
    }
}
//export default ButtonEx;