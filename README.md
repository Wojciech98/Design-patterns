# CarFuctions
The project was created to show the application of design patterns. It contains three design patterns that represent a universal, proven solution to frequently occurring, repetitive design problems. It shows the relationships and dependencies between classes and objects and facilitates the creation, modification and maintenance of the source code.

## Technologies
-Java

-MySql

## Types of design patterns

###  Builder
The builder pattern, as name implies, is an alternative way to construct complex objects. This should be used only when you want to build different immutable objects using same object building process.

>**creating objects cars**

![image](https://user-images.githubusercontent.com/43965599/119951702-89a49480-bf9c-11eb-903d-e42041db40cd.png)


### Command
Wzorzec poleceń jest wzorcem projektowym behawioralnym i jest częścią formalnej listy wzorców projektowych GoF . Mówiąc najprościej, wzorzec ma na celu  zahermetyzowanie w obiekcie wszystkich danych wymaganych do wykonania danej czynności (polecenia), w tym metody wywołania, argumentów metody i obiektu, do którego metoda należy.
Model ten pozwala nam oddzielić obiekty, które wytwarzają polecenia od ich konsumentów , dlatego wzorzec jest powszechnie znany jako wzorzec producent-konsument.

>**connecting to a database using a pattern**

![image](https://user-images.githubusercontent.com/43965599/119952392-3e3eb600-bf9d-11eb-9a8c-6b3091a5b995.png)


### Decorator
A Decorator pattern can be used to attach additional responsibilities to an object either statically or dynamically. A Decorator provides an enhanced interface to the original object.In the implementation of this pattern, we prefer composition over an inheritance – so that we can reduce the overhead of subclassing again and again for each decorating element. The recursion involved with this design can be used to decorate our object as many times as we require.

>**assigning additional responsibilities to an object statically or dynamically.**

![image](https://user-images.githubusercontent.com/43965599/119952907-c1f8a280-bf9d-11eb-97ce-79bafb8d79b8.png)






License
----

MIT


**Free Software**
