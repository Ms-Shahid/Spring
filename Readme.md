## Conference Web Application—Spring MVC


### Details 
- The application is set up using mvn & developed using spring mvc
- App uses the Spring annotations to handle the dependency & multiple beans 
- The Speaker list is created at the repository layer using @Repository(used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.)
- @Service - the business logic resides within the service layer
- @Controller - handles the incoming HTTP request through Dispatcher
- @ModelMap - Handles the view 
- The configurations are set using @Configuration in AppConfig, it can be described using setter or constructor injection mechanisms
- @Bean - creates a bean