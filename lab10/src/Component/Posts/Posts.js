import React from 'react';
import { useEffect,useState } from 'react';
import axios from 'axios';
import Post from '../Post/Post';

export default function Posts() {

    const [posts, setPosts] = useState([]);
   // const [flag,setFlag] =useState('false');

    // const flagHandler =()=>{
    //     setFlag(!flag);
    // }
    useEffect(() => {
        axios.get('http://localhost:8080/posts')
            .then(response => {
                setPosts([...response.data]);   
            })
            .catch(e => {console.log(e)});
    },[]);

    const postlist = posts.map(post => {
        return <Post 
        key={post.id} 
        title={post.title} 
        author={post.author}
        // clicked={() => {postSelectedHandler(post.id)}}
        />
    });

    return (
        <div>
            <section className="Posts">
                {postlist.length===0?"Loading":postlist}
            </section>

        </div>
    )
}
