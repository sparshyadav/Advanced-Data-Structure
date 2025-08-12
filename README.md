# Project Title
Restaurant Review App

# Short Description
This is a Restaurant Review App that allows users to view and submit reviews for different restaurants.

# Features
- View list of restaurants
- View details of a specific restaurant
- Submit a review for a restaurant

# Installation Instructions
1. Clone the repository:
```
git clone https://github.com/username/restaurant-review-app.git
```
2. Install dependencies:
```
npm install
```
3. Start the development server:
```
npm start
```

# Usage Examples
1. Viewing all restaurants:
```javascript
const restaurants = await fetch('http://localhost:8000/restaurants');
console.log(restaurants);
```

2. Viewing details of a specific restaurant:
```javascript
const restaurantId = 1;
const restaurantDetails = await fetch(`http://localhost:8000/restaurants/${restaurantId}`);
console.log(restaurantDetails);
```

3. Submitting a review for a restaurant:
```javascript
const reviewData = {
    restaurant_id: 1,
    name: 'John Doe',
    rating: 4,
    comments: 'Great food and service!'
};
const response = await fetch('http://localhost:8000/reviews', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify(reviewData)
});
console.log(response);
```

# Contributing Guidelines
To contribute to this project, follow these steps:
1. Fork the repository
2. Create a new branch
3. Make your changes
4. Submit a pull request

Thank you for contributing!

# License
MIT License

# Contact
For any questions or feedback, please contact [Author Name](mailto:author@example.com).