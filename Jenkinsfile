pipeline {
    options {
        buildDiscarder (logRotator(nunToKeepStr: '5', artifactNumToKeepStr: '5'))
        }
    agent any
    tools {
        maven 'mymaven'
    }
	stages {
		stage ('code Compile'){
			steps {
				echo 'code is going to compile'
				sh 'mvn clean compile'
			}
		}
		stage ('code Test'){
			steps {
				echo 'code is going to test'
				sh 'mvn clean test'
			}
		}
		stage ('code package'){
			steps {
				echo 'code is going to package'
				sh 'mvn clean package'
			}
		}
	}
}