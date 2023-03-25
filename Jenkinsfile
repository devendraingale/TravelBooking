Pipeline {
    options {
        buildDiscarder (logRotator(nunToKeepStr: '5', artifactumToKeepStr: '5'))
        }
    agent any
    tools {
        maven ‘maven_3.9.1'
    }
	stages {
		stage ('code Compile'){
			steps {
				"sh mvn clean compile"
			}
		}
		stage ('code Test'){
			steps {
				"sh mvn clean test"
			}
		}
		stage ('code package'){
			steps {
				"sh mvn clean package"
			}
		}
	}
}