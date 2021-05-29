# zoo-management

  Start:

  mvn clean install
  mvn spring-boot:run 

Default port: 8080

Database: In memory h2 database

Endpoints:
Fetch all animals
- api/animals/birds

Save Mammals:
- api/animals/mammal
- request body:
{
	"name":"Sparrow",
	"species":"BIRDS"
}

Save Reptiles
  api/animals/reptile
  {
	"name":"Sparrow",
	"species":"REPTILES"
}

Save Birds
  api/animals/birds
  {
    "canFly" :"true",
	"name":"Sparrow",
	"species":"REPTILES"
}