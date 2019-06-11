import React from 'react';
import './App.css';

class CategoryView extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            error: null,
            isLoaded: false,
            categories: []
        };
    }

    componentDidMount() {
        fetch("http://localhost:8080/category")
            .then(res => res.json())
            .then(
                (result) => {
                    console.log(result);
                    this.setState({
                        isLoaded: true,
                        categories: result
                    });
                },
            )
    }

    render() {
        const { error, isLoaded, categories } = this.state;
        if (error) {
            return <div>Error: {error.message}</div>;
        } else if (!isLoaded) {
            return <div>Loading...</div>;
        } else {
            return (
                <div>
                    <h2>Categories</h2>
                    <ul>
                        {categories.map(category => (
                            <li key={category.id}>
                                {category.id} {category.name}
                            </li>
                        ))}
                    </ul>
                </div>
            );
        }
    }
}

function App() {
  return (
      <div className="App">
          <div>
              <CategoryView/>
          </div>
      </div>
  );
}

export default App;
