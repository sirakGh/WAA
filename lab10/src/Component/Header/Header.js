import React from 'react';
import './Header.css';
import { useSelector, useDispatch } from 'react-redux';
import { authActions } from '../../store/index';
import { Link, Redirect } from 'react-router-dom';
import 'react-router';
import { Authontication } from '../../store/Authontication';
import { useContext } from 'react';
import { name } from '../../store/name';



const Header = (props) => {
  const {isAuthonticated, setIsAuthonticated} = useContext(Authontication) ;
  const {named, setNamed} = useContext(name) ;
 //const isAuthenticated = useSelector(state => state.auth.isAuthenticated); // put the name of the slice
  const dispatch = useDispatch();
  // const isAuthenticated=false;
  const logoutHandler = () => {
    dispatch(authActions.logout());
    <Redirect to='/post' />;
  }

  return (
    <header className="header">
      <h1>Lab 10</h1>
      
        <ul>
          <li>
            <Link to="/post"> Post </Link>
          </li>
          <li>
            <Link to="/newpost"> New Post</Link>
          </li>
          <li>
            <Link to="/login">  Sign in</Link>
          </li>
          {/* <li>
            <button onClick={logoutHandler}>Logout</button>
          </li> */}
          {
            isAuthonticated&& ( <nav>
              <ul> 
                <li>
                  <Link to ="/profile"> Profile </Link>
                  </li>
                  <li><h2> Welcome , {named}</h2> </li></ul></nav>)
          }
        </ul>
     

    </header>
  );
};
// {isAuthenticated && (<nav></nav>
export default Header;
