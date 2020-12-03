plugins {
    java
}

group = "pl.edu.agh.gg"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(group="log4j", name= "log4j", version=getProperty("LOG4J_VERSION"))

    implementation(group="org.graphstream", name= "gs-core", version=getProperty("GRAPHSTREAM_VERSION"))
    implementation(group="org.graphstream", name= "gs-ui", version=getProperty("GRAPHSTREAM_UI_VERSION"))
    implementation(group="org.graphstream", name= "gs-algo", version=getProperty("GRAPHSTREAM_VERSION"))

    implementation(group="org.javatuples", name= "javatuples", version=getProperty("JAVA_TUPLES_VERSION"))

    implementation(group="com.google.code.gson", name= "gson", version=getProperty("GSON_VERSION"))

    implementation(group="io.reactivex.rxjava3", name= "rxjava", version=getProperty("RXJAVA3_VERSION"))

    testImplementation(group="org.junit.jupiter", name= "junit-jupiter-api", version=getProperty("JUNIT_VERSION"))
    testRuntimeOnly(group="org.junit.jupiter", name= "junit-jupiter-engine", version=getProperty("JUNIT_VERSION"))
}

fun getProperty(name: String): String = rootProject.properties[name] as String