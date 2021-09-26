import React from 'react';
import { BrowserRouter } from 'react-router-dom';

import AuthBlock from './Container/AuthBlock/AuthBlock';
function App() {
  return (
    <BrowserRouter>
      <AuthBlock />
    </BrowserRouter>
  );
}

export default App;
