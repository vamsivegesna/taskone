# firstservice:

This is a Spring Boot service with below APIs:

> GET /firstservice/message
>
> Example Request:
> curl 'http://ec2-18-215-174-52.compute-1.amazonaws.com:8080/firstservice/message'
>
> Example Response:
> Up
>
> POST /firstservice/message
>
> Example Request:
> curl --location --request POST 'http://ec2-18-215-174-52.compute-1.amazonaws.com:8080/firstservice/message' --header 'Content-Type: application/json' --data-raw '{ "name" : "John", "surname" : "Doe" }'
>
> Example Response:
> Hello John Doe

Note: For more information related to APIs access http://ec2-18-215-174-52.compute-1.amazonaws.com:8080/firstservice/swagger-ui.html