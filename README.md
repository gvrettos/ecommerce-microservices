# ecommerce-microservices
A demo application implementing products and cart of products as miscroservices storing their data in an in-memory database (H2) and communicating using a message broker (ActiveMQ). It introduces basic microservices concepts like API Gateway and Service Discovery.

# Structure
The application consists of 4 microservices (2 business + 2 utility):
* product-service
* cart-service
* api-gateway (used for improving security, scalability and high availability)
* eureka-server (service discovery that allows services to search and communicate with each other without hard-coding their URIs)

# Functionality
ecommerce-microservices functionalities include:
* Adding products
* Listing products
* Adding products to a cart
* Listing cart products

# Set up and run the application
1. Download [ActiveMQ](http://activemq.apache.org/)
2. Unzip the file. Go to bin folder and run `activemq start`.
3. Start the eureka-server
4. Start the rest of the microservices in any order
5. Use Postman or other client to check the functionality
6. Check [ActiveMQ console](http://localhost:8161/) and [Eureka console](http://localhost:9000/).

# Source
Special thanks to @sofieneBK for his great article on [Building microservices with Spring Boot](https://medium.com/nerd-for-tech/building-microservices-with-spring-boot-753be739ca7d)