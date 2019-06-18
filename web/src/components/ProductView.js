import React from 'react';

class ProductView extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            error: null,
            isLoaded: false,
            products: []
        };
    }

    componentDidMount() {
        fetch("http://localhost:8080/product")
            .then(res => res.json())
            .then(
                (result) => {
                    console.log(result);
                    this.setState({
                        isLoaded: true,
                        products: result
                    });
                },
            )
    }

    render() {
        const { error, isLoaded, products } = this.state;
        if (error) {
            return <div>Error: {error.message}</div>;
        } else if (!isLoaded) {
            return <div>Loading...</div>;
        } else {
            return (
                <div>
                    <h2>Products</h2>
                    {products.map(product => (
                        <div key={product.id}> {product.id} {product.name} </div>
                    ))}
                </div>
            );
        }
    }
}

export default ProductView;
