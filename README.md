# Survey Builder

> To Run This Application Follow The Steps

* git clone https://github.com/vivektwr/survey_builder.git
* cd survey_builder
* mvn clean install
* run as spring boot application  **or**
* cd target
* java -jar survey_builder.jar

## Spring Boot Actuator

* **/health** – Shows application health information. it’s not sensitive by default
* **/info** – Displays arbitrary application info. not sensitive by default
* **/metrics** – Shows ‘metrics’ information for the current application. it’s also sensitive by default
* **/trace** – Displays trace information (by default the last few HTTP requests)

## Swagger UI

> Swagger UI is a built-in solution which makes user interaction with the Swagger-generated API documentation much easier.

* **/v2/api-docs** – Response with a large number of key-value pairs, which is not very human-readable.
* **/swagger-ui.html** – Swagger provides Swagger UI for this purpose.