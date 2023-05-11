rootProject.name = "Juke.PostgreSQL"

sourceControl {
    gitRepository(uri("https://github.com/sibkit/Juke.git")) {
        producesModule("com.github.sibkit:Juke")
    }
    gitRepository(uri("https://github.com/sibkit/Juke.JDBC.git")) {
        producesModule("com.github.sibkit:Juke.JDBC")
    }
}