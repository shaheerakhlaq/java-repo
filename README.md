## 1. Custom Annotation
A Custom Annotation in Java is a user-defined metadata tag that can be applied to classes, methods, fields, or other program elements. It provides a way to add supplementary information to code without affecting its logic. Custom annotations are defined using the @interface keyword and can include elements (parameters) to store metadata.

### Key Features:
* **Retention Policy**: Specifies how long the annotation should be retained (e.g., SOURCE, CLASS, RUNTIME).
* **Target**: Defines where the annotation can be applied (e.g., METHOD, TYPE, FIELD).
* **Use Cases**:
  * Marking methods for specific behavior (e.g., logging, security checks).
  * Providing configuration details for frameworks like Spring.
  * Enabling compile-time or runtime processing via tools like reflection or Aspect-Oriented Programming (AOP).

```
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}
```

## 2. Aspect-Oriented Programming (AOP)
Aspect-Oriented Programming (AOP) is a programming paradigm that aims to increase modularity by separating cross-cutting concerns (e.g., logging, transaction management, security) from the core business logic. AOP achieves this by introducing "aspects," which encapsulate these concerns and apply them to specific points in the application.

### Core Concepts:
* **Aspect**: A modular unit that encapsulates cross-cutting concerns.
* **Join Point**: A specific point in the execution of a program (e.g., method invocation).
* **Advice**: The action taken by an aspect at a particular join point (e.g., @Before, @After, @Around).
* **Pointcut**: An expression that defines where an advice should be applied.
* **Weaving**: The process of applying aspects to the target objects.
* **Use Cases**:
  * Logging method execution.
  * Transaction management in database operations.
  * Security checks (e.g., role-based access control).

```
@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Executing: " + joinPoint.getSignature().getName());
    }
}
```

## 3. Design Patterns
Design Patterns are reusable solutions to common software design problems. They provide a structured approach to solving recurring issues in object-oriented programming and promote best practices for code maintainability, scalability, and readability.

#Categories:
* **Creational Patterns**: Focus on object creation mechanisms (e.g., Singleton, Factory, Builder).
* **Structural Patterns**: Deal with object composition and relationships (e.g., Adapter, Proxy, Composite).
* **Behavioral Patterns**: Address communication between objects (e.g., Observer, Strategy, Command).
* **Example**: Singleton Pattern
* Ensures that a class has only one instance and provides a global point of access to it.

```
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

## 4. JSON Web Token (JWT)
A JSON Web Token (JWT) is a compact, URL-safe token format used for securely transmitting information between parties as a JSON object. JWTs are commonly used for authentication and authorization in web applications.

### Structure:
* **Header**: Contains metadata about the token (e.g., algorithm type).
* **Payload**: Stores claims (e.g., user ID, roles, expiration time).
* **Signature**: Ensures the token's integrity by signing the header and payload with a secret key.
* **Use Cases**:
  * User authentication (e.g., sessionless login).
  * Securely transmitting data between services in a microservices architecture.
  * Token-based authorization for APIs.

```
String jwt = Jwts.builder()
    .setSubject("user123")
    .claim("role", "admin")
    .setExpiration(new Date(System.currentTimeMillis() + 3600000))
    .signWith(SignatureAlgorithm.HS256, "secretKey")
    .compact();
```

## 5. WebClient
WebClient is a modern, reactive, non-blocking HTTP client introduced in Spring WebFlux. It is designed to replace the traditional RestTemplate and supports asynchronous and streaming operations.

### Key Features:
* **Non-Blocking**: Enables high-performance, scalable communication.
* **Reactive Streams**: Supports backpressure and asynchronous processing.
* **Builder API**: Provides a fluent interface for constructing HTTP requests.
* **Error Handling**: Simplifies handling errors and timeouts.
* **Use Cases**:
  * Making REST API calls in a reactive application.
  * Streaming large datasets without blocking threads.
  * Building microservices that require efficient inter-service communication.

```
WebClient webClient = WebClient.create();

Mono<String> response = webClient.get()
    .uri("https://api.example.com/data")
    .retrieve()
    .bodyToMono(String.class);

response.subscribe(data -> System.out.println("Received: " + data));
```
### Summary Table

The following table provides an overview of key software development concepts and their applications:

| CONCEPT           | PURPOSE                                                                 | KEY FEATURES                                                                 |
|-------------------|-------------------------------------------------------------------------|----------------------------------------------------------------------------|
| **Custom Annotation** | Add metadata to code for processing or documentation                  | Retention policy, target, runtime processing                                   |
| **AOP**          | Separate cross-cutting concerns from business logic                      | Aspects, join points, advice, pointcuts, weaving                                |
| **Design Patterns** | Provide reusable solutions to common design problems                     | Creational, structural, behavioral patterns                                      |
| **JWT**          | Securely transmit information between parties                             | Header, payload, signature; compact, stateless                                  |
| **WebClient**    | Perform non-blocking, reactive HTTP requests                             | Reactive streams, builder API, error handling, asynchronous support             |
