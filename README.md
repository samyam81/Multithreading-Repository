# Multithreading Repository

This repository contains Java classes and examples related to multithreading concepts.

## Files

### BlockingQueue.java

A class representing a blocking queue, which is a thread-safe queue that supports operations such as `add` and `remove`. It utilizes synchronization mechanisms to ensure thread safety.

### Stack.java

Implementation of a stack data structure with thread safety. It includes methods like `push` and `pop` to manipulate the stack. Synchronization is achieved using locks.

### Thread1.java

A simple Java thread class that extends `Thread`. It demonstrates basic usage of threads by printing messages.

### Thread2.java

An implementation of `Runnable` interface for creating threads. Similar to `Thread1.java`, it prints messages to demonstrate threading.

### threadtester.java

A Java class containing examples and tests related to multithreading. It includes scenarios like deadlock creation and thread state checking.

## Running the Examples

To run the examples, you can execute the `main` methods in the respective classes.

```java
// Example usage of BlockingQueue
BlockingQueue queue = new BlockingQueue(10);
queue.add(1);
int removedItem = queue.remove();

// Example usage of Stack
Stack stack = new Stack(5);
stack.push(10);
int poppedItem = stack.pop();

// Example usage of threadtester
threadtester.main(new String[]{});
Ensure you have a Java Development Kit (JDK) installed on your system to compile and run the Java files.
```

## Contributing
Feel free to contribute by adding more examples, improving existing code, or fixing any issues. Fork the repository, make your changes, and submit a pull request.
