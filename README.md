# Spring annotations with XML & JAVA 
Exploring the Spring &amp; spring framework architectures 
Spring is a light weight framework of other various frameworks such as spring-core, spring-mvc, spring-AOP & so on.

This git-repo contains all the hands-on learning & the projects related to all the spring framework family. 

First talking about the various XML & Java based configurations & annotations 

- [<i>Spring fundamentals-repo</i>](https://github.com/Ms-Shahid/Spring/tree/spring-fundamentals) <br>
  consists of a basic application, which describes how the wiring of the model, service & repository components are wired together.
  Note: The instances of components are tightly coupled in this application

- [<i>Spring XML</i>](https://github.com/Ms-Shahid/Spring/tree/spring-XML) <br>
  is wired up with applicationContext.xml for constructor injection, setter injection & bean Autowire configurations such as
```
- byType: searches for the bean in given class (doesn't care about the setter name)
- byName: searches for the setter injection (setter method) in the given class
- Constructor: requires the no-argument(default) constructor
- no : (none)
```

- [<i>Spring XML Annotations</i>](https://github.com/Ms-Shahid/Spring/tree/spring-XML-Annotations) <br>
  Here the application is modified to use the stereotype bean annotations along with constructor & setter injections in the applicationContext such as 
```
- @Component : any POJO based annotation
- @Service : business logic tier, (in the service-interface class)
- @Repository : data layer
```

- [<i>Spring JAVA Annotations</i>](https://github.com/Ms-Shahid/Spring/tree/spring-java-annotations) <br>
  - The application is purely based on the Java Annotations with AppConfig & properties file.
  Here the components are wired up with <b>@componentScan</b> which searches at the root package level.
  - And beans are configured to use setter & constructor injection.
  Also, the application is configured with singleton & prototype scope configurations at the service tier
