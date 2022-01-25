import React, { Component } from "react";
export class Simple extends React.Component {
    handleButton = (event) => {
        console.log('Handle Button');
        console.log(event);
    }
    render() {
        return (<div>
            <button onClick={(event) => { console.log(event) }}></button>
            <button onClick={this.handleButton}>SecondButton</button>
        </div>)
    }
}
export function Input() {
    return (<div>
        <input type='text' onChange={(event) => { console.log(event) }} />
        <button onClick={(event) => { console.log(event) }}>Click2</button>
    </div>)
}
function Button() {
    let handleClick = (event) => {
        console.log(event);
    }
    return (<div>
        <button onClick={{ handleClick }}>Click</button>
    </div>)
}

export default Button;