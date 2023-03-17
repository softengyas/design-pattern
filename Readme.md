# Projet de démonstration des design patterns en Java - Yassine Lambarki

> - Strategy.
> - Observer.
> - Decorator.
> - Singleton.
> - Prototype.
> - Builder.
> - Adapter


## Explications: 

1. Strategy : Ce pattern permet de définir une famille d'algorithmes, encapsule chacun d'eux et les rend interchangeables. Il permet à l'utilisateur de choisir l'algorithme qui convient le mieux à un moment donné. Dans notre exemple, nous avons créé des classes pour les différentes stratégies de remises dans un magasin en ligne (carte de crédit, PayPal, Bitcoin).
<br><br>
2. Observer : Ce pattern permet de définir une relation un-à-plusieurs entre les objets, de sorte que lorsqu'un objet change d'état, tous ses dépendants sont notifiés et mis à jour automatiquement. Dans notre exemple, nous avons créé un sujet appelé "Subject" et trois observateurs appelés "HexaObserver", "BinaryObserver" et "OctalObserver". Chacun de ces observateurs a une méthode "update()" qui est appelée automatiquement lorsque le sujet change d'état.
<br><br>
3. Decorator : Ce pattern permet d'ajouter des fonctionnalités à un objet de manière dynamique. Il est utile lorsque nous avons besoin de modifier le comportement d'un objet existant sans en changer la classe. Dans notre exemple, nous avons créé une classe de base pour les pizzas et plusieurs décorateurs pour ajouter des ingrédients tels que du fromage ou du pepperoni. Cela nous permet de créer différentes combinaisons de pizzas sans avoir à créer une classe pour chaque variante.
<br><br>
4. Singleton : Ce pattern garantit qu'une classe n'a qu'une seule instance et fournit un point d'accès global à cette instance. Il est souvent utilisé pour les objets qui nécessitent une coordination centralisée, comme les gestionnaires de connexion de base de données. Dans notre exemple, nous avons créé une classe Singleton pour un gestionnaire de configuration.
<br><br>
5. Prototype : Ce pattern permet de créer de nouveaux objets en clonant un objet existant plutôt qu'en utilisant un constructeur. Il est utile lorsque la création d'un objet est coûteuse en termes de ressources et qu'il existe déjà une instance similaire que nous pouvons cloner. Dans notre exemple, nous avons créé une classe Prototype pour les formes et des classes concrètes pour différents types de formes, telles que cercle et carré.
<br><br>
6. Builder : Ce pattern permet de construire des objets complexes en séparant la construction de l'objet de sa représentation. Il est utile lorsque la création d'un objet nécessite plusieurs étapes complexes et que nous voulons une méthode plus flexible et modulable pour les effectuer. Dans notre exemple, nous avons créé une classe PizzaBuilder pour construire une pizza et des classes concrètes telles que HawaiianPizzaBuilder pour construire différents types de pizzas. Nous avons également créé une classe PizzaDirector pour diriger le processus de construction en utilisant le PizzaBuilder approprié.
<br><br>
7. Adapter : Ce pattern permet de faire collaborer des classes qui ont des interfaces incompatibles. Il est utile lorsque nous avons besoin d'utiliser une classe qui ne correspond pas à notre interface existante, ou lorsque nous voulons réutiliser une classe existante sans la modifier. Dans notre exemple, nous avons créé une classe Adapteur pour faire fonctionner une vieille application de dessin avec un nouveau système de rendu.