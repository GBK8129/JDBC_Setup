# JDBC_Setup for MySQL

An instance of the class com.mysql.cj.jdbc.Driver is created using Class.forName()
An object con of class Connection is made and is initialised with the connection set up with local host.
An object st of class Statement is made and it is used to send SQL queries to the database via the connection setup.
Using executeUpdates() we send the query we expect to be executed.
Now to print the resultant DB, executeQuery() is further used and the command Select * from ‘NameofTable’ is used and the result is stored is rs
A while loop is opened till rs.next() exit and the details and displayed.
