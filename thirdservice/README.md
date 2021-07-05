# thirdservice:

This is a Spring Boot service with below APIs:

> POST /thirdservice/message
>
> Example Request:
> curl --location --request POST 'http://ec2-52-87-220-172.compute-1.amazonaws.com:8080/thirdservice/message' --header 'Content-Type: application/json' --data-raw '{ "name" : "John", "surname" : "Doe" }'
>
> Example Response:
> John Doe

Note: For more information related to APIs access http://ec2-52-87-220-172.compute-1.amazonaws.com:8080/thirdservice/swagger-ui.html