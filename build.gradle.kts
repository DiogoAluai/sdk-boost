plugins {
    id("java")
    `maven-publish`
}

version = project.findProperty("version") as String

java {
    // Configuration to specify the jar name
    withJavadocJar()
    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "daluai.lib"
            artifactId = project.findProperty("jarName") as String
            version = project.findProperty("version") as String
            from(components["java"])
        }
    }
}

dependencies {
    compileOnly("com.google.android:android:4.1.1.4")
    testImplementation(libs.junit)
}

