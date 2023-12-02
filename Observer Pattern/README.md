# Real-time News Subscription Service

## Overview

The Real-time News Subscription Service is designed to provide immediate notifications to subscribers about breaking news as soon as it's published by the news agency. The system consists of two main components: NewsAgency and Subscriber.

## Class Definitions

### NewsAgency
The `NewsAgency` class serves as the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available. The `NewsAgency` class supports the following functionalities:

- **Subscription Management:**
  - Users can subscribe to the news service.
  - Subscribers are promptly notified when new news is published.

- **Dynamic Subscription Updates:**
  - The system allows for dynamic subscription updates.
  - Subscribers can subscribe, unsubscribe, or modify their preferences without disrupting other subscribers.

- **Decoupled Communication:**
  - Communication between the news agency and subscribers is decoupled.
  - Subscribers don't directly request news updates but are notified by the news agency when new information is available.

### Subscriber
The `Subscriber` class represents users or entities subscribed to the news service. Subscribers receive immediate notifications about any breaking news published by the agency. The `Subscriber` class supports the following functionalities:

- **Joining and Leaving Service:**
  - Subscribers can join the service to receive news updates.
  - Subscribers can leave the service without affecting the delivery of news to other subscribers.

- **Flexibility for Future Enhancements:**
  - The system is designed to provide flexibility for future enhancements.
  - Potential enhancements may include personalized subscriptions or categorization of news updates.

## Expected Behavior

- When the news agency publishes breaking news, all subscribed users receive immediate updates.
- Subscribers can join or leave the service without affecting the delivery of news to other subscribers.
- The system provides flexibility for future enhancements, such as personalized subscriptions or categorization of news updates.

## Constraints

- The system should be scalable to handle a growing number of subscribers without compromising performance.
- The implementation follows object-oriented design principles, promoting loose coupling between the news agency and subscribers.

With the Real-time News Subscription Service, subscribers can stay informed about breaking news in a timely and efficient manner, while the system remains adaptable to future improvements and an increasing number of users.

### Class Diagram



### Demo
Here's a screenshot demonstrating how the Real-time News Subscription Service works:
![image](https://github.com/ariessalvador/Software-Engineering-1-Projects/assets/142958841/d93d57b4-42b8-4a7a-adea-30e605da28b5)

