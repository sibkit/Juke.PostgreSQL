plugins {
    id("java")
}

group = "com.github.sibkit"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

sourceSets {
    main {
        java {
            srcDir("src")
        }
    }
}

dependencies {
    implementation("com.github.sibkit:Juke:v.0.1")
    implementation("com.github.sibkit:Juke.JDBC:v.0.1")
    implementation("org.postgresql:postgresql:42.2.18")
}