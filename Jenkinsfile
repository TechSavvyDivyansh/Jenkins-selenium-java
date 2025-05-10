pipeline {
    agent any

    tools {
        maven 'Maven 3.8.8'
        jdk 'JDK 17'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-user/selenium-maven-demo.git' // <-- Change to your repo
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Publish Results') {
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
