import React, { useState } from 'react';
import { useEffect } from 'react';

import Post from '../../Component/Post/Post';
import FullPost from '../../Component/FullPost/FullPost';
import NewPost from '../../Component/NewPost/NewPost';
import './Blog.css';
import axios from 'axios';
//import post from '../../Component/Post/Post';

const Blog = () => {

     const [posts, setPosts] = useState([]);
     const [flag,setFlag] =useState('false');
     const [selectedPost, setSelectedPost] =useState({title:"",author:"",content:""})
    const [deleteFlag,setDeleteFlag] = useState('false');
     const [selectedId, setSelectedId] = useState(null);
    
    // get all the POSTS
    useEffect(() => {
        axios.get('http://localhost:8080/posts')
            .then(response => {
                setPosts([...response.data]);   
            })
            .catch(e => {console.log(e)});
    },[flag]);

    //delete post with specific ID
  
    const deleteHandeler = () => {
        axios.delete(`http://localhost:8080/posts/${selectedId}`)
        .then (response =>{
            setPosts(posts.filter(p=>p.id !== selectedId))
            setSelectedId(null);
        })
    }

   // GET POSTS WITH THE SELECTED ID
    useEffect(()=>{
        axios.get(`http://localhost:8080/posts/${selectedId}`)
        .then(response =>{
            setSelectedPost(response.data);
            
        })
    },[deleteFlag])


    const postSelectedHandler = (id) => {
        setSelectedId(id);
        setDeleteFlag(!deleteFlag);
    }

    const flagHandler =()=>{
        setFlag(!flag);
    }

  
    const postlist = posts.map(post => {
        return <Post 
        key={post.id} 
        title={post.title} 
        author={post.author}
        clicked={() => {postSelectedHandler(post.id)}}/>
    });

    // 
    return (
       
        <div>
            <section className="Posts">
                {postlist.length===0?"Loading":postlist}
            
            </section>
            <section>
                <FullPost 
                title={selectedPost.title}
                id={selectedId} 
                author={selectedPost.author}
                content={selectedPost.content}
                delete={deleteHandeler}
                /> 
                
            </section>
            <section>
                <NewPost execute={flagHandler} />
            </section>
        </div>
    );
}


export default Blog;