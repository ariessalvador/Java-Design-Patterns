# Simplified Hotel Management System

## Overview

The Simplified Hotel Management System is designed to streamline the management of various hotel services related to guest check-in and check-out. These services encompass valet parking for vehicles, room cleaning, and the handling of luggage carts. The HotelApp aims to simplify and centralize the interaction with these services through a unified interface provided by the FrontDesk. By doing so, the FrontDesk class effectively delegates client requests to the relevant service classes (Valet, HouseKeeping, and Cart), abstracting the intricacies of the services from the client.

## Class Definitions

### HotelService (Interface)
The HotelService interface establishes a common foundation for all hotel services, ensuring that each service adheres to a consistent structure and set of operations.

### Valet
The Valet class is a service implementation that adheres to the HotelService interface. It is responsible for providing valet parking services, which include the parking and retrieval of guests' vehicles. The Valet class offers a method called `pickUpVehicle(plateNumber)` to facilitate this service.

### HouseKeeping
HouseKeeping is another service class that adheres to the HotelService interface. It manages the crucial task of room cleaning, ensuring that guest rooms are immaculate and comfortable. This service class provides the `cleanRoom(roomNumber)` method for this purpose.

### Cart
The Cart service class also follows the HotelService interface. Its primary responsibility is to handle guest requests related to luggage carts. This class includes the `requestCart(numberOfCarts)` method, making it efficient and straightforward for guests to obtain the necessary carts.

### FrontDesk
The FrontDesk class serves as the facade, orchestrating seamless interactions between the client, HotelApp, and the various hotel services. It acts as a central point of contact for clients and shields them from the complexities of individual service implementations.

### HotelApp
The HotelApp class represents the client application that relies on the FrontDesk facade to access and utilize hotel services effortlessly. Through the FrontDesk, HotelApp can seamlessly and efficiently engage with various hotel services, enhancing the overall guest experience.

With the Simplified Hotel Management System, guests can enjoy a convenient and enjoyable stay, while the hotel staff can provide top-notch services in an organized and efficient manner.

### Class Diagram
![image](https://github.com/ariessalvador/Software-Engineering-1-Projects/assets/142958841/280e1108-7c32-46b3-936d-a381d918d861)

### Demo
Here's a screenshot demonstrating how the Simplified Hotel Management System works:
![image](https://github.com/ariessalvador/Software-Engineering-1-Projects/assets/142958841/22ff1cd7-4749-4282-ab78-ccc89af1eb34)


