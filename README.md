# Logger
Wrapper of android logger that removes hassle of specifying the tag over and over again.

# Repository
It's not published anywhere.
To use it, first publish it to local maven repository: `gradle assemble app:publishToMavenLocal` and then import it to android project.
Import example for gradle kts: 
```
dependencies {
    ...
    implementation("daluai.lib:sdk-boost:1.0.0")
    ...
}
```

