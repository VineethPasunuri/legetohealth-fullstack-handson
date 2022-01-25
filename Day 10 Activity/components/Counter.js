import React, { Component } from "react";

export class Counter extends React.Component {
    constructor(props) {
        super(props);
        this.state = { likes: 0, dislikes: 0 };
    }
    likesCounter = (event) => {
        this.setState(prevState => ({ likes: prevState.likes + 1 }));
    }
    disLikesCounter = (event) => {
        this.setState(prevState => ({ dislikes: prevState.dislikes + 1 }))
    }

    render() {
        return (<div>
            <h2>Counter Com[ponent</h2>
            <p>Like(s) : {this.state.likes}</p>
            <p>Dislike(s) : {this.state.dislikes}</p>
            <button onClick={this.likesCounter}>Like</button>
            <button onClick={this.disLikesCounter}>disLike</button>
        </div>)
    }
}