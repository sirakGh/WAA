import logo from './logo.svg';
import './App.css';
import Student from './container/Student/Student';


//This is a function component
// It returns a react element
// JSX file
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Student/>
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
      <h1>
        This is react demo
      </h1>
    </div>
  );
}

export default App;
