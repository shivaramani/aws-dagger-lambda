# AWS Lambda Using Dagger (Dependency Injection)

DI will help write loosely couple architecture. By moving the dependencies to the interface of the components the code will be more readable and manage dependencies between the objects.
Additionally DI helps to provide easier testing with different mock implementation

For AWS Lambdas "Minimize the complexity of your dependencies. Prefer simpler frameworks that load quickly on execution context startup. For example, prefer simpler Java dependency injection (IoC) frameworks like Dagger or Guice, over more complex ones like Spring Framework."

Please refer this link for more details
https://docs.aws.amazon.com/lambda/latest/dg/best-practices.html

    1. This simple AWS Lambda makes use Dagger to build the dependency injection
    2. Provide commonly used objects (like Gson/Utilities classes/Dynamo, S3, SQS helper) through DI
    3. A sample Utility Module class with Gson is injected into the DaggerHandler
    3. The sample service just returns the input request and returns a success message


### Testing
    1. $ mvn clean package
    2. Create a new AWS Lambda (in console or CLI),
        - Name: daggerSvc
        - Runtime: java8
        - Role: Default Lambda Role
    3. Upload the the jar.
    4. Provide "com.example.InvocationHandlers::handleDaggerRequest" in "Handler" textbox (on the AWS Console)
    5. "Save" and "Test"