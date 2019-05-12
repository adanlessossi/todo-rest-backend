# TODO Rest Backend

This application aims to illustrate the use of SpringBoot REST Backend API to serve a 'Todo' Angular Frontend.

In this application, we are trying to use:

- Spring Boot Data-Jpa
- Spring Boot Security
- Authentication using JWT

## Getting Started

Clone this repository to your local computer.

### Prerequisites

To make this code run, you will certainly need install:

- Java 8 or above
- Maven 3.5.x
- An IDE of your choice

### Installing

Open the Application in your favorite IDE.

### Generate a new Password

To create et new Password for the sample Application, you will need to generate it from the class `BCryptEncoder`, and then change the token and username in the class `JwtInMemoryUserDetailsService`.

## Running the application

Open the Main class `RestBackendApplication` and Run-As 'Java Application', (depending on your IDE).

## Built With

- [Spring-Boot](https://spring.io) - The Spring Boot framework
- [Maven](https://maven.apache.org/) - Dependency Management

## Authors

- **Bernard Adanlessossi** - _Initial work_

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

- **Thomas Wenger**
- **Business & Decision**
