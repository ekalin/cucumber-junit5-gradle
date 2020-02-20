plugins {
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")

    testImplementation("io.cucumber:cucumber-java:5.4.0")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:5.4.0")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}
