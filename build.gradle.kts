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

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.jetbrains:annotations:24.1.0")
}

application {
	mainClass = "me.dovias.vtech.sort.BenchmarkApplication"
}