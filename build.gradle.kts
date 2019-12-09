plugins {
    kotlin("js") version "1.3.61"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    maven { url = uri("https://kotlin.bintray.com/kotlin-js-wrappers/") }
    maven { url = uri("https://dl.bintray.com/kotlin/kotlinx.html/") }
}

val reactVersion = "16.9.0-pre.88-kotlin-1.3.60"

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains:kotlin-react:$reactVersion")
    implementation("org.jetbrains:kotlin-react-dom:$reactVersion")
    testImplementation(kotlin("test-js"))
}

kotlin {
    sourceSets["main"].dependencies {
        implementation(npm("react", "16.9.0"))
        implementation(npm("react-dom", "16.9.0"))
        implementation(npm("core-js", "3.4.8"))
    }
    target {
        browser {
        }
    }
}
