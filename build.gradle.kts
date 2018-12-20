import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.example"
version = "1.0-SNAPSHOT"


plugins {
    java
    kotlin("jvm") version "1.3.11"
    application

}

application {
    mainClassName = "com.example.demo.HelloKt"
}

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    testCompile("junit", "junit", "${Deps.junitVersion}")
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}