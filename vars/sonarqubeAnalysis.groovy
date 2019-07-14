def call(def mavenHome, def sonarQuery) {

environment {
            MAVEN_HOME = "${mavenHome}"
 }
	
  sh "mvn ${sonarQuery}"
}
