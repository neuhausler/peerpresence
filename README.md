# peerpresence

Create Eclipse project files:

	./gradlew eclipse
	
Or Create IntelliJ project files:

	./gradlew idea
 
## Running and Testing Application

Start the application

	./gradlew run

Testing HelloWorld Resource

	curl http://localhost:8080/peerpresence
	
Testing Admin Functions

	curl http://localhost:8081
	curl http://localhost:8081/ping
	curl http://localhost:8081/healthcheck
	curl http://localhost:8081/metrics

