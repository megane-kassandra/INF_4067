# Rapport sur les principes SOLID

## 1. Présentation du projet

Ce projet porte sur l'étude et l'application des cinq principes SOLID dans la programmation orientée objet.

Il a été réalisé dans le cadre du cours **Principes-SOLID-Rappels**, sous la supervision de **Dr Valéry MONTHE**, à l'Université de Yaoundé I, Département d'Informatique.

L'objectif principal est de comprendre comment les principes SOLID permettent d'améliorer la conception des logiciels en rendant le code plus facile à maintenir, à comprendre, à tester et à faire évoluer.

Le travail présente, pour chaque principe, deux modèles de conception :
- Un modèle qui ne respecte pas le principe.
- Un modèle corrigé qui respecte le principe.

Les exemples utilisés sont ceux étudiés pendant le cours.

## 2. Les objectifs du projet

Ce travail vise à :

- Comprendre les cinq principes SOLID.
- Identifier les mauvaises pratiques de conception orientée objet.
- Comprendre les problèmes liés à une mauvaise organisation des classes et des dépendances.
- Proposer des conceptions respectant les principes SOLID.
- Illustrer les différences entre les modèles non conformes et les modèles conformes à l'aide de diagrammes de classes.

## 3. Les principes étudiés

### S — Single Responsibility Principle (SRP)

**Principe de responsabilité unique**

Une classe doit avoir une seule responsabilité et une seule raison de changer.

L'exemple étudié concerne la classe `Book`, qui regroupe plusieurs responsabilités : la gestion des données du livre, son affichage, sa sauvegarde et sa gestion métier.

La solution consiste à séparer ces responsabilités dans les classes suivantes :
- `BookSRP`
- `BookPrinter`
- `BookSaver`
- `BookBusinessLogic`

### O — Open/Closed Principle (OCP)

**Principe ouvert/fermé**

Une entité logicielle doit être ouverte à l'extension, mais fermée à la modification.

L'exemple étudié concerne le calcul de la surface de formes géométriques avec `AreaCalculator`.

La solution repose sur l'utilisation de l'interface `Shape`, implémentée par les classes `Rectangle` et `Circle`. La classe `AreaCalculator2` utilise cette abstraction pour effectuer les calculs grâce au polymorphisme.

### L — Liskov Substitution Principle (LSP)

**Principe de substitution de Liskov**

Une classe dérivée doit pouvoir remplacer sa classe de base sans modifier le comportement attendu du programme.

L'exemple étudié concerne l'héritage entre `Square` et `Rectangle`. Cette relation pose un problème lorsque les méthodes de modification des dimensions ne conservent pas le comportement attendu.

La solution consiste à faire implémenter une interface commune `Shape` par les classes `Square` et `Rectangle`, sans établir de relation d'héritage directe entre elles.

### I — Interface Segregation Principle (ISP)

**Principe de ségrégation des interfaces**

Une classe ne doit pas être obligée d'implémenter des méthodes dont elle n'a pas besoin.

L'exemple étudié concerne une interface `Worker` qui impose les méthodes `work()` et `eat()` aux travailleurs humains et aux robots.

La solution consiste à séparer cette interface en deux interfaces :
- `Workable` : contient la méthode `work()`.
- `Eatable` : étend `Workable` et ajoute la méthode `eat()`.

Ainsi, `HumanWorker` implémente `Eatable`, tandis que `RobotWorker` implémente uniquement `Workable`.

### D — Dependency Inversion Principle (DIP)

**Principe d'inversion des dépendances**

Les modules de haut niveau ne doivent pas dépendre directement des modules de bas niveau. Les deux doivent dépendre d'abstractions.

L'exemple étudié concerne la classe `OrderProcessor`, qui dépend directement de `MySQLDatabase`.

La solution consiste à introduire une interface `Database`, implémentée par `MySQLDatabase` et `MongoDBDatabase`. La classe `OrderProcessor` dépend alors de cette abstraction, grâce à l'injection de dépendances.

## 4. Technologies et outils utilisés

- **Java :** langage utilisé pour les exemples de programmation orientée objet.
- **LaTeX :** langage utilisé pour rédiger et mettre en forme le rapport.
- **Overleaf :** environnement de rédaction et de compilation du document LaTeX.
- **GitHub :** plateforme utilisée pour héberger le code source et les documents du projet.

## 5. Résultat attendu

À la fin de ce travail, on obtient un rapport présentant les cinq principes SOLID, leurs définitions, leurs intérêts et des exemples illustrant les conceptions qui les respectent ou qui les violent.

Ce projet permet ainsi de mieux comprendre l'importance d'une bonne conception orientée objet et l'intérêt de l'application des principes SOLID dans le développement logiciel.

## 6. Auteur

**Nom :** MATSINKOU TAKOUDJOU MEGANE KASSANDRA  
**Matricule :** 23V2147  
**Établissement :** Université de Yaoundé I  
**Département :** Informatique  
**Niveau :** M1  
**Année académique :** 2026–2027

**Enseignant :** Dr Valéry MONTHE