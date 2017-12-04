# Scala Skeleton

## Execution
Build
```
./gradlew clean build
```

Tests
```
./gradlew clean test
```

ShadowJar
```
./gradlew clean shadowJar
```
***Note**: shadowJar force to run tests, so we know that we are not building a jar with failing tests.*

Execute
```
java -jar build/libs/scala-skeleton-1.0.0-all.jar --dummies 2
```


## Libraries
### Gradle
- [Gradle Test Logger Plugin](https://github.com/radarsh/gradle-test-logger-plugin): A Gradle plugin for printing beautiful logs on the console while running tests.
- [Gradle Shadow](https://github.com/johnrengelman/shadow): Gradle plugin for creating fat/uber JARs with support for package relocation.


### Project
- [Scallop](https://github.com/scallop/scallop): A simple command-line arguments parsing library for Scala