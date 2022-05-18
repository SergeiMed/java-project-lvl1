install:
	./gradlew clean install

run-dist:
	./build/install/java-project-lvl1/bin/java-project-lvl1

build:
	./gradlew clean build

check:
	gradle checkstyleMain

clean:
	./gradlew clean

run:
	./gradlew run

installDist:
	./gradlew installDist