# Product Management CRUD

## Introduction

### Java, Spring Boot + MySQL

WIP

This is a simple products management REST API. (Frontend TBA)


## Setup

1. **Clone** this repository

```bash
git clone https://github.com/SebilleK/ProductManagement.git # Clone repo
```

2.  Make sure you have a **running MySQL server** and set up a **valid database connection**.

Suggested/possible way of doing this:
- Start up a MySQL server with Xampp
- Manage that connection and add a "products" database to your server with MySQL Workbench or DBeaver
- Edit application.properties / application.yml as needed according to the set-up connection
(you only need to use one of these config files, but both are included)

3. **Run the app**
```bash
./mvnw spring-boot:run # Run app
```

## Included Endpoints, Docs

Generated Javadoc included in **docs/javadoc**.

### Endpoints

**POST**

/product/add - adds a single product to the db

/product/addlist - adds a JSON list of products to the database

**GET**

/products - fetches all products

/product/id/{id} - fetches a product by id

/product/name/{name} - fetches a product by name

**PUT**

/product/update - updates a product


**DELETE**

/product/delete/{id} - deletes a product by id

--- 

TO DO:

- Add Frontend (1) - (enable cors)
- Dockerization (2)
