package oopprinciples.encap;

public class TheStrategyPattern {
//  defines a family of algorithms, encapsulates each one, and makes them interchangeable.
//    this lets the algorithm vary independently from clients that use it.

//    Family of Algorithms: (flying behaviors ex)
//    AlgorithmImpl_2-> AlgorithmInterface <- AlgorithmImpl_1

//    Family of Clients: (has-a relationship)
//    Subclass -> Superclass w AlgorithmInterface behavior (set+perform() Behaviors) <- Subclass
}
