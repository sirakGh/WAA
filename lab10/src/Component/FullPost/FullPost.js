import axios from 'axios';
import React, { Component, useState } from 'react';

import './FullPost.css';

const FullPost = (props) => {
        let post = <p>Please select a Post!</p>;
        if(props.id !=null){
            post = (
                <div className="FullPost">
                    <h1>{props.title}</h1>
                    <p>{props.id}</p>
                    <p>{props.author}</p>
                    <p>{props.content}</p>
                    <div className="Edit">
                        <button className="Delete" onClick={props.delete}>Delete</button>
                    </div>
                </div>
                 );
        }

       
        return post;
    }

export default FullPost;