import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version ("1.2.71")
    id("org.jetbrains.kotlin.plugin.noarg") version ("1.2.71")
    id("org.jetbrains.kotlin.plugin.allopen") version ("1.2.71")
}

group="com.zjnh"
version="1.0-SNAPSHOT"

configure<JavaPluginConvention> {
    setSourceCompatibility(1.8)
}

repositories {
    mavenCentral()
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testCompile(group="junit", name="junit", version="4.12")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget="1.8"
}

allOpen {
    annotation("com.zjnh.train.annotations.Poko")
}

noArg {
    annotation("com.zjnh.train.annotations.Poko")
}
