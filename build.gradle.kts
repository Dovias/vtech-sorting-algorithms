plugins {
    id("java")
    id("application")
}

group = "me.dovias.vtech.sort"
version = 1.0

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "me.dovias.vtech.sort.Application"
}