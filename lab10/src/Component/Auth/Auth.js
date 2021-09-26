import React, { useRef } from 'react';
import './Auth.css';
import { useDispatch } from 'react-redux';
import { authActions } from '../../store/index';
import { Authontication } from '../../store/Authontication';
import { useContext } from 'react';
import { name } from '../../store/name';

const Auth = (props) => {
  
  const {isAuthonticated, setIsAuthonticated} = useContext(Authontication) ;
  const {named, setNamed} = useContext(name) ;
  const dispatch = useDispatch();
  const formData = useRef();

  const loginHandler = () => {
   
    const form = formData.current
    const userCredentials = { username: form['user'].value, password: form['password'].value };
        
    dispatch(authActions.login(userCredentials));
    props.history.push("/post");
    setIsAuthonticated(true);
    setNamed(form['user'].value);
  }

  return (
    <main className="auth">
      <section>
        <form ref={formData} onSubmit={loginHandler}>
          <div >
            <label htmlFor='user'>User</label>
            <input type='text' id='user' />
          </div>
          <div >
            <label htmlFor='password'>Password</label>
            <input type='password' id='password' />
          </div>
          <button >Login</button>
        </form>
      </section>
    </main>
  );
};

export default Auth;
