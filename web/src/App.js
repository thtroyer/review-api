import React from 'react';
import CategoryView from './components/CategoryView'
import './App.css';
import ProductView from "./components/ProductView";
import ReviewView from "./components/ReviewView";


function App() {
  return (
      <div className="App">
          <div>
              <CategoryView/>
              <ProductView/>
              <ReviewView/>
          </div>
      </div>
  );
}

export default App;
