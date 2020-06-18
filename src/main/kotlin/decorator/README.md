# Decorator Pattern  
The book, *Head First Design Patterns*, describes the Decorator Pattern as follows:  

> Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.  

Some bullet points taken directly from the text:  
* Inheritance is one form of extension, but not necessarily the best way to achieve flexibility in our designs.  
* In our designs we should allow behavior to be extended without the need to modify existing code.  
* Composition and delegation can often be used to add new behaviors at runtime.  
* The decorator pattern provides an alternative to subclassing for extending behavior.  
* The decorator pattern involves a set of decorator classes that are used to wrap concrete components.  
* Decorator classes mirror the type of the components they decorate. (In fact, they are the same type as the components they decorate, either through inheritance of interface implementation.)  
* Decorators change the behavior of their components by adding new functionality before and/or after (or even in place of) method calls to the component.  
* You can wrap a component with any number of decorators.  
* Decorators are typically transparent to the client of the component; that is, unless the client is relying on the component's concrete type.  
* Decorators can result in many small objects in our design, and overuse can be complex.
