# Sample React Kotlin Application

This is a simple React application written in Kotlin. This sample uses
Kotlin/JS Gradle plugin for doing all the magic.

Run it with:
```
./gradlew run
```

Build it with:
```
./gradlew build
```

Build result will be placed to `build/libs` folder as JAR archive. 
You need to just unpack it and be happy.

## Troubles

* Live reload seems to be broken. It brokes after importing React libraries.
* Resulting js file name without hash
* Resulting js seems to be not minimized/optimized/obfuscated

## Further plans

* Add Dukat (https://github.com/Kotlin/dukat) for Typescript -> Kotlin conversion
* Add custom design system, for example Antd (https://ant.design/)
* Add MVP
* Add some screens
* Add unit, ui tests