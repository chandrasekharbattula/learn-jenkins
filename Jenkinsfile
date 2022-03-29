pipeline {
    agent any
    parameters {
        string(name: 'BRANCH_NAME', defaultValue: 'develop', description: 'Git Branch to checkout the code from', trim: true)
    }
    stages {
        stage("Build") {
            // compile and build the fat jar with all third party dependencies
            agent {
                docker {image 'gradle:6.9-jdk11'}
            }
            steps {
                sh "./gradlew clean build"
            }
        }

        stage("Deploy Artifacts") {
            steps {
                // Move the artifacts(Script file, fat jar) to s3 bucket.
                sh "pwd"
            }
        }
        stage("Terraform") {
            steps {
                sh "echo 'Terraform Step'"
            }
        }

    }
}