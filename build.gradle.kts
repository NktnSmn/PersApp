buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        RootProjectParams.deps.forEach { classpath(it) }
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}