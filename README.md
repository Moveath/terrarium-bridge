# Terrarium Bridge

Assignment 3 for Software Design Patterns.

Author: [Moveath](https://github.com/Moveath)

## About

This Java console program shows the Bridge design pattern using terrariums and watering systems.

A desert terrarium uses 50 ml of water. A tropical terrarium uses 200 ml. Each terrarium can use manual or automatic watering. The program prints the watering actions to the console.

## Bridge pattern

Bridge separates the terrarium type from the watering system, so they can be changed independently.

| Role | Class |
| --- | --- |
| Abstraction | `Terrarium` |
| Refined Abstractions | `DesertTerrarium`, `TropicalTerrarium` |
| Implementor | `WateringSystem` |
| Concrete Implementors | `ManualWatering`, `AutomaticWatering` |
| Client | `Main` |

`Terrarium` is an abstract class that holds a `WateringSystem` reference. The `WateringSystem` interface has the `water(int amountMl)` method. Each terrarium chooses the water amount and calls this method.

`Main` creates a desert terrarium with manual watering and a tropical terrarium with automatic watering. It then uses `setWateringSystem()` to switch both systems at runtime. The same terrarium objects use the new systems.

## Clean Code

1. **Separate responsibilities:** terrariums decide how much water is needed; watering systems decide how to deliver it.
2. **Meaningful names:** names like `ManualWatering` and `waterPlants()` explain their purpose.
3. **Small classes and methods:** each class has a clear job, and methods are short and easy to read.
4. **Depend on interfaces:** `Terrarium` uses `WateringSystem`, so it does not need to know the concrete watering class.
5. **Easy extension:** a new watering class can implement `WateringSystem` without changing the terrarium classes.

## How to run

Install a Java JDK. Open a terminal in the project folder and run:

```sh
javac *.java
java Main
```

Expected output:

```text
Desert terrarium
Manual watering: pour 50 ml of water
Tropical terrarium
Automatic watering: pump 200 ml of water
Switching watering systems
Desert terrarium
Automatic watering: pump 50 ml of water
Tropical terrarium
Manual watering: pour 200 ml of water
```
