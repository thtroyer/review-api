import React from 'react';

class ReviewView extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            error: null,
            isLoaded: false,
            reviews: []
        };
    }

    componentDidMount() {
        fetch("http://localhost:8080/review")
            .then(res => res.json())
            .then(
                (result) => {
                    for (let i=0; i<result.length; i++) {
                        console.log(result[i]);
                        result[i].productBrand = result[i].product.brand;
                        result[i].productName = result[i].product.name;
                        result[i].categoryValues = [];
                        delete result[i].product;
                        for (let j=0; j < result[i].categories; j++) {
                            result[i].categoryValues.append(result[i].categories[j]);
                        }
                        delete result[i].categories;
                    }
                    console.log(result);
                    this.setState({
                        isLoaded: true,
                        reviews: result
                    });
                },
            )
    }

    render() {
        const { error, isLoaded, reviews } = this.state;
        if (error) {
            return <div>Error: {error.message}</div>;
        } else if (!isLoaded) {
            return <div>Loading...</div>;
        } else {
            return (
                <div>
                    <h2>Reviews</h2>
                    {reviews.map(review => (
                        <div key={review.id}>
                            Id: {review.id} <br/>
                            Product: {review.productBrand} {review.productName} <br/>
                            Categories: {review.categories} <br/>
                            Rating: {review.rating} / 5 <br/>
                            Notes: {review.notes} <br/>
                            <br/>
                        </div>
                    ))}
                </div>
            );
        }
    }
}

export default ReviewView;
