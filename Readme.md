#A Spring and MySQL Powered REST API
This is the very beginning of a project that will be a REST API powered by Java, Spring MVC, and MySQL. The goal is to allow users to type in a URL with a page number, and get back a raw JSON object containing the data for the corresponding page my interactive comic This Is Not a Test. The page data will have originated from a relational database on the server, then been retrieved by Spring, and finally sent to the requesting client as a JSON object.
 
#Example
The project isn't up and running yet on a production server. You'll have to download and run things manually with the Spring Tool Suite.

#Progress: 50%
I've got a mock REST service working and a mock MySQL connection working. I just generated all of the SQL to create the proper table and records in the database. Next I'm going to get the put the SQL code in the database abstraction object, then get it to configure and return page objects when requested. Those objects will be sent out as JSON.

#Things I'm Loving About Spring
* The Spring Tool Suite is built on Eclipse, so all the things I enjoyed about building my java book-lending application apply
* So far, routing and building a simple web server has been really easy! Next step: connect to a MySQL database.
* It's very easy to switch databases by simply changing the data source properties and Maven dependencies. 


