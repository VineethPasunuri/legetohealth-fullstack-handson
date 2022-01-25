import React, { Component } from "react";
export class Activity extends React.Component {
    constructor(props) {
        super(props);
        this.state = { name: '', gender: '', salary: '' };
    }
    handleChange = (event) => {
        this.setState({ [event.target.name]: event.target.value })
    }
    handleClick = (event) => {
        console.log(this.state.name)
    }
    render() {
        return (<div>
            Name :<input type='text' name="name" onChange={this.handleChange} /> <br />
            <input type='radio' name="gender" onChange={this.handleChange} />Male <br />
            <input type='radio' name="gender" onChange={this.handleChange} />Female <br />
            <input type='number' name="salary" onChange={this.handleChange} /> <br />
            <button type='submit' onClick={this.handleClick}>submit</button>
            <div>Name :{this.state.name}, Gender :{this.state.gender}, Salary : {this.state.salary}</div>
        </div>)
    }
}