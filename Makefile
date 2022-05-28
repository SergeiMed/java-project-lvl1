install:
	./gradlew clean install

run-dist:
	./build/install/app/bin/app

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