plugins {
    id("java")
    `maven-publish`
}

var sdkBoostVersion = "1.0.0"
var sdkJarName = "sdk-boost"

java {
    // Configuration to specify the jar name
    withJavadocJar()
    withSourcesJar()
}

tasks.jar {
    manifest {
        archiveBaseName.set(sdkJarName)
        archiveVersion.set(sdkBoostVersion)
    }
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "daluai.lib"
            artifactId = sdkJarName
            version = sdkBoostVersion

            from(components["java"])
        }
    }
}

dependencies {
    compileOnly("com.google.android:android:4.1.1.4")
    testImplementation(libs.junit)
}

