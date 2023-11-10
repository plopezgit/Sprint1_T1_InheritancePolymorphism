# Sprint1_T1_InheritancePolymorphism

Level 1

- Exercise 1

In a music group there are different types of musical instruments. There are wind, string and percussion instruments.

All instruments have their name and price as attributes. Also, they have a method called touch(). This is abstract in the instrument class and, therefore, must be implemented in child classes. If a wind instrument is being played, the method must show to the console: "A wind instrument is being played", if a string instrument is being played: "A string instrument is being played" and if playing a percussion instrument: "A percussion instrument is playing".

The process of loading a class takes place only once. Shows that loading can be caused by the creation of the first instance of this class or by accessing a static member of this class.

Find information about initialization blocks and static blocks in Java.

> ##### Solution notes:
> - Intrument class is abstract, which mean, among other stuff, that is not going to be intanciated. As an abstracta class, it can be armoured by either class and abstract method.
> - In this case, instrument class is required to give its heritage to at least 3 sub classes, that uses the extends keyword to declare that family relation.
> - Given the abstract method play() declared on the parent class, the childs override its own verion of it. Given this exercise is only a demo, those childs method body implementation are only simple calls to println method, passing simple differentiate string phrase a parameter. It seems enough for the exercise.
> - The demostration required on the exercise stament is covered by simple code block, and a static code block as part of the parent class. The static code block is the only one executed when accesing a static memeber of the class (static calss attribute in this case).
	 

- Exercise 2

Create a class "Car" with the attributes: make, model and power. Brand must be static final, model static and power final. Show the difference between the three. Is there one that can be initialized in the class constructor?

Add two methods to the "Car" class. A static method called slow() and a non-static method called accelerate(). The accelerate method must show by console: "The vehicle is accelerating" and the brake() method must show: "The vehicle is braking".

Demonstrate how to invoke static and non-static method from main() of main class.


> ##### Solution notes:
> - Is there one that can be initialized in the class constructor? private final int pontencyCar; The final attribute.
> - The exercise demostration is simply solved by invoking the static method from Class name (Car) declaration, and the non-static one from an specific object instance (oneCar).


Level 2

- Exercise 1

Create a class called "Phone" with the make and model attributes, and the call() method. This method should receive a String with a phone number. The method should display a console message saying that the number received by parameter is being called.

Create an interface called "Camera" with the photograph() method, and another interface called Clock with the alarm() method.

Create a class called "Smartphone" that is a subclass of "Phone" and implements both the "Camera" and "Watch" interfaces.

The photograph() method must display on the console: “A picture is being taken” and the alarm() method must display: “The alarm is sounding”.

From the main() of the application, create a Smartphone object and call the previous methods.

> ##### Solution notes:
> - Simple demostration of powerfull method heritage/overriding by extending a super class and implementing interfaces. This foresee what is called functional interface (one method interface) when get the lambda expression uses.
> - Lambda alternative funtional interafce method implementation will be: 
>> Camara camara = () -> "A photo is being taking";
>> System.out.println(camara.takeAPhoto());

Level 3

- Exercise 1

In a sports newsroom they have the news classified by sports: football, basketball, tennis, F1 and motorcycling.

The newsroom can have more than one editor, and we want to know the name, ID and salary of each of them. Once an ID has been assigned, it can never be changed. All editors have the same salary, and if in the future the company can increase it, it will do so to everyone equally. At the moment the current salary is €1500.

Each editor can work on more than one news item. News items must have a headline, text, rating and price. At the time of creation, the text must be empty.

In addition, from the football news you must know which competition it refers to (String), which club (String) and which player (String).

From the basketball news, you must indicate which competition it refers to (String) and which club (String).

From the tennis news you have to know which competition(String) they are talking about and which tennis players(String).

From the F1 news we need to know which team(String) they refer to.

From the motorcycling news, you must indicate which team (String) they are from.

News is sold to different media. To know the price of each news item we must implement a method called calculateNewsPrice().

> ##### Solution notes:
> - Learned: int redactorIndex = redactorList.indexOf(redactor);


**Logic input:**

Here is how to calculate the price of each piece of news:

- Football news:
- Initial price: €300
- Champions League: €100
- Barça or Madrid: €100
- Ferran Torres or Benzema: €50


Example: A piece of news about a goal by Ferran Torres of Barça in the Champions League has a price of €550.

Basketball News:

- Initial price: €250
- Euroleague: €75
- Barça or Madrid: €75


Tennis News:

- Initial price: €150
-Federer, Nadal or Djokovic: €100


F1 News:

- Initial price: €100
- Ferrari or Mercedes: €50


Motorcycling News:

- Initial price: €100
- Honda or Yamaha: €50


The following criteria are used to calculate news scores:

Football News:

- 5 Points.
- Champions League: 3 points
- League: 2 points
- Barça or Madrid: 1 point
- Ferran Torres or Benzema: 1 point

Example: A news story about a goal by Ferran Torres of Barça in the Champions League has a score of 10 points.


Basketball News:

- 4 points

Euroleague: 3 points

- ACB: 2 points
- Barça or Madrid: 1 point


Tennis News:

- 4 points
- Federer, Nadal or Djokovic: 3 points


F1 news:

- 4 points
- Ferrari or Mercedes: 2 points


Motorcycling News:

- 3 points
- Honda or Yamaha: 3 points


In the main class, a menu must be made with the following options:

- Enter editor.

- Remove editor.

- Introduce news to an editor.

- Delete news (must request editor and title of the news).

- Show all the news by editor.

- Calculate the score of the news.

- Calculate price-news.