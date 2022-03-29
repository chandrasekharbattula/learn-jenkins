pipeline {
    agent any
    parameters {
        string(name: 'BRANCH_NAME', defaultValue: 'develop', description: 'Git Branch to checkout the code from', trim: true)
    }
    stages {
        stage("Build") {
            // compile and build the fat jar with all third party dependencies
            steps {
                sh "chmod +x -R ${env.WORKSPACE}"
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