# Logger
Wrapper of Android logger that removes the hassle of specifying the tag repeatedly.

# Adding dependency - gradle
Add [jitpack](https://jitpack.io/#DiogoAluai/sdk-boost/) dependency resolution in `settings.gradle.kts`:
```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven { setUrl("https://jitpack.io") } // <= add jitpack resolution
    }
}
```
Then add the dependency in `build.gradle.kts` (Module App):
```
dependencies {
    ...
    implementation("com.github.DiogoAluai:sdk-boost:1.1.0")
    ...
}
```


Or you could first publish it to a maven repository with `gradle assemble app:publishToMavenLocal`, and then import it to Android project:
```
dependencies {
    ...
    implementation("daluai.lib:sdk-boost:1.0.0")
    ...
}
```

