# This is an application for getting people's data
## Main controller's functions and their prescription
1. GetPeople  - this is a function for getting the whole list of data from H2 database: /api/v1/people.
2. GetPerson - this is a function for getting a person which was found by id: /api/v1/people/{id}.
3. SavePerson - this is a function for saving a new person to the database and updating an existing sample: /api/v1/people/add (JSON format of an object of Person).
