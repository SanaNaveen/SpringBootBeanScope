# Spring Bean Scopes examples

## Importing and running project
Step 1 : Import project as Maven project
Step 2 : Run application as Spring Boot Application
Step 3 :Run following test to observer instances. Also, Observe log to see different instance.

## How is it used in example

Step 1 : Controller uses request, session, singleton, application, prototype
Step 2 : 
    URL : http://localhost:8080/executeMapping:
    METHOD : GET
    PAYLOAD : ---
    RESULT : 
    ```
    {
    "requestBean": "com.example.SpringBeanScope.service.RequestScopedService@3d053d8b : Hash Code : 1023753611",
    "sessionBean": "com.example.SpringBeanScope.service.SessionScopedService@bbb1678 : Hash Code : 196810360",
    "singletonBean": "com.example.SpringBeanScope.service.SingletonScopedService@50ddb295 : Hash Code : 1356706453",
    "prototypeBean": "com.example.SpringBeanScope.service.PrototypeScopedService@59e13356 : Hash Code : 1507930966",
    "applicationBean": "com.example.SpringBeanScope.service.ApplicationScopedService@a3aecbf : Hash Code : 171633855"
    }
    ```

Step 3 :
    URL : http://localhost:8080/executeMapping1:
    METHOD : GET
    PAYLOAD : ---
    RESULT :
    ```
    {
    "requestBean": "com.example.SpringBeanScope.service.RequestScopedService@3d053d8b : Hash Code : 1023753611",
    "sessionBean": "com.example.SpringBeanScope.service.SessionScopedService@bbb1678 : Hash Code : 196810360",
    "singletonBean": "com.example.SpringBeanScope.service.SingletonScopedService@50ddb295 : Hash Code : 1356706453",
    "prototypeBean": "com.example.SpringBeanScope.service.PrototypeScopedService@59e13356 : Hash Code : 1507930966",
    "applicationBean": "com.example.SpringBeanScope.service.ApplicationScopedService@a3aecbf : Hash Code : 171633855"
    }
    ```
    
