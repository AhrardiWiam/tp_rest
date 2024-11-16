 # Application de Gestion des Étudiants Spring Boot

Ce projet est une application Spring Boot simple permettant de gérer une liste d'étudiants. Il utilise Spring Data JPA pour l'interaction avec la base de données (MySQL), expose des API RESTful pour les services web, et inclut des tests unitaires ainsi qu'une documentation Swagger.

## Fonctionnalités

* **Opérations CRUD :** Créer, lire, mettre à jour et supprimer des enregistrements d'étudiants.
* **API RESTful :** Fournit des points de terminaison REST pour interagir avec les données des étudiants.
* **Base de données MySQL :** Stocke les informations des étudiants dans une base de données MySQL.
* **Spring Data JPA :** Simplifie les interactions avec la base de données grâce aux repositorys et entités.
* **Tests unitaires :** Des tests unitaires complets utilisant JUnit 5 et Mockito pour garantir la qualité du code.
* **Interface utilisateur Swagger :** Documentation interactive de l'API via Swagger pour faciliter les tests et l'exploration des points de terminaison.

## Technologies utilisées

* **Java 17** 
* **Spring Boot** 
* **Spring Data JPA** : Pour la gestion des entités et des interactions avec la base de données.
* **MySQL** : Base de données relationnelle utilisée pour stocker les informations des étudiants.
* **Maven** : Outil de gestion de projet et de dépendances.
* **JUnit 5** : Framework de tests unitaires.
* **Mockito** : Framework de moquage pour les tests unitaires.
* **Springdoc OpenAPI** : Pour générer la documentation Swagger de l'API RESTful.

## Installation

### 1. Cloner le dépôt

Clonez le projet depuis le dépôt Git en utilisant la commande suivante :

```bash
git clone [Votre URL de dépôt]
```

### 2. Configuration de la base de données

1. Créez une base de données MySQL nommée `studentdb`.
2. Dans le fichier `src/main/resources/application.properties`, configurez les paramètres de connexion à la base de données MySQL si nécessaire :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
```

### 3. Compilation et exécution

1. Naviguez vers le répertoire du projet dans votre terminal.
2. Compilez le projet en utilisant Maven :

```bash
mvn clean install
```

3. Exécutez l'application :

```bash
mvn spring-boot:run
```

### 4. Accès à l'interface Swagger

Une fois l'application en cours d'exécution, vous pouvez accéder à la documentation interactive de l'API à l'adresse suivante :

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## Points de terminaison de l'API

Consultez l'interface Swagger pour obtenir une documentation détaillée des points de terminaison. Voici un aperçu des principaux points de terminaison disponibles :

![image](https://github.com/user-attachments/assets/9a88d86a-bf67-4334-90e3-bb7de402371d)


## Démonstration avec POSTMAN


https://github.com/user-attachments/assets/910d14ef-aacb-48f8-94d7-da2eccf1eda4





