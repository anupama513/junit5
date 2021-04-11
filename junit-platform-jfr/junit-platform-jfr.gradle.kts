plugins {
	`java-library-conventions`
}

description = "JUnit Platform Flight Recorder Support"

dependencies {
	api(platform(project(":junit-bom")))
	api(libs.apiguardian)
	api(project(":junit-platform-launcher"))
}

javaLibrary {
	mainJavaVersion = JavaVersion.VERSION_11
}

tasks {
	compileModule {
		options.release.set(11)
	}
}