import React, {Component} from "react";
 export class UserName extends React.Component {

}
function Name(){
    let getName = (event) =>{
        const name = event.target.value;
        console.log(name);
    } 
    return (<div>
        <input type = 'text' onChange={getName}/>
    </div>)
}