# Observer Pattern  
The book, *Head First Design Patterns*, describes the Observer Pattern as follows:  

> The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.  

Some bullet points taken directly from the text:  
* The observer pattern defines a one-to-many relationship between objects.  
* Subjects, or as we also know them, Observables, update Observers using a common interface.  
* Observers are loosely coupled in that the observable knows nothing about them, other than that they implement the observer interface.  
* You can push or pull data from the observable when using the pattern (pull considered more correct).  
* Don't depend on a specific order of notification for your observers.
