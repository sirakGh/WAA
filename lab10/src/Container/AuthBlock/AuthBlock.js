import React, { Fragment} from 'react'
import Header from '../../Component/Header/Header';
import { Redirect, Route, Switch } from 'react-router';
import Posts from '../../Component/Posts/Posts';
import NewPost from '../../Component/NewPost/NewPost';
import Auth from '../../Component/Auth/Auth';




const AuthBlock = () => {
 

    return (
        
        <Fragment>
            <Header />
            <Switch>
                <Route path='/post' component={Posts} />
                <Route path='/login' component={Auth} />
                <Route path='/newpost' component={NewPost} />
                {/* <Route path='/products' component={Products}/> */}
                <Redirect from="/" to='post' />
            </Switch>
        </Fragment>
      
    );
}

export default AuthBlock;