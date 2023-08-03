# Movies-Review-Backend

This is a Spring Boot backend project that provides APIs for reviewing films and storing the reviews in a MongoDB database.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
  - [Configuration](#configuration)
  - [API Endpoints](#api-endpoints)
- [Contributing](#contributing)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- MongoDB (version v6.0.6)

### Installation

   ```bash
   git clone https://github.com/yourusername/your-springboot-project.git
```
1. Navigate to the project directory:
  ```bash
  cd Movie-Review-Backend
```
2. Buikd the project
   ```bash
   ./mvnw clean package
   
3. Run the application:
   ```bash
   java -jar application.jar

## Usage

### Configuration

Before running the project, make sure to configure your application properties. Open the src/main/resources/application.properties file and update the MongoDB connection settings:

`spring.data.mongodb.uri=mongodb://localhost:27017/film_reviews`

Adjust other configurations as needed.

### API Endpoints
* POST /api/reviews
Create a new film review.

* GET /api/reviews
Retrieve a list of all film reviews.

* GET /api/reviews/{id}
Retrieve a single film review by ID.

* PUT /api/reviews/{id}
Update a film review by ID.

* DELETE /api/reviews/{id}
Delete a film review by ID

Refer to the API documentation or source code for more details on request and response formats.

## Contibuting

Contributions are welcome! If you find any issues or want to add new features, please submit a pull request.

