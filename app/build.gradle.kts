plugins {
    java
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "daluai.lib"
            artifactId = "sdk-boost"
            version = "1.1.0-SNAPSHOT"

            from(components["java"])
        }
    }
}

dependencies {
    compileOnly("com.google.android:android:4.1.1.4")
    testImplementation(libs.junit)
}

