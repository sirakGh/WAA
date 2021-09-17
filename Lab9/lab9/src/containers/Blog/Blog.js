import React, { useState } from 'react';
import { useEffect } from 'react';

import Post from '../../components/Post/Post';
import FullPost from '../../components/FullPost/FullPost';
import NewPost from '../../components/NewPost/NewPost';
import './Blog.css';
import axios from 'axios';

const Blog = () => {

    // state holding the posts of the container

    const [posts, setPosts] = useState([]);
    const [flag, setFlag] = useState(true);

    const [selectedId, setSelectedId] = useState(null);


     //states to get post by ID
     const [selectedPost, setSelectedPost] = useState({ title: "", author: "", content: "" })
     const [deleteFlag,setDeleteFlag]=useState(true);

    // updating the state for setFlag ... to make the axios.get(All Requests) only if the setPosts is updated
    const updateFlag = () => {
        setFlag(!flag);
    }

      // updating the state of the selected ID
      const postSelectedHandler = (id) => {
        setSelectedId(id);
        //updating the delete flag .... to make the axios.get(Get post by ID) only if a post is selected
        setDeleteFlag(!deleteFlag)
    }


    //To get Posts
    useEffect(() => {
        axios.get('http://localhost:8081/posts')
            .then(response => {
                const sposts = response.data.slice(0, 5);  // This will get them but take the first 5 then you would have to change the response.data i nthe setPosts
                setPosts([...sposts]);
                // setPosts([...response.data]);   // if you dont want to limit
            });
    }, [flag]);


    // We can do this rather than this :: <Post title={{...posts[1]}.title} />
    const rposts = posts.map(post => {
        return <Post
            key={post.id}
            title={post.title}
            author={post.author}
            clicked={() => { postSelectedHandler(post.id) }} />
    });


    const postDeleteHandler = () => {
        if (window.confirm("Are you sure you want to delete")) {
            axios.delete(`http://localhost:8081/posts/${selectedId}`)
                .then(response => {
                    setPosts(posts.filter((post) => post.id != selectedId));
                    setSelectedId(null);
                });
        }
    };

    // get post by ID
    useEffect(() => {
        axios.get(`http://localhost:8081/posts/${selectedId}`)
            .then(response => {
                setSelectedPost(response.data);
            });

    },[deleteFlag])


    return (

        <div>
            <section className="Posts">
                {rposts}
            </section>
            <section>
                <FullPost
                    id={selectedId}
                    title={selectedPost.title}
                    content={selectedPost.content}
                    author={selectedPost.author}
                    deletePost={postDeleteHandler}
                />

            </section>
            <NewPost execute={updateFlag} />
        </div>
    );
}


export default Blog;

// /Users/bereket/Desktop/Educational/WAA/Week3/D2/lab9/src/containers/Blog/Blog.js