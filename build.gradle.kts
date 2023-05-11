plugins {
    id("java")
}

group = "com.github.sibkit"
version = "1.0-SNAPSHOT"

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
}