pipeline {
    agent any

    tools {
        maven 'Maven 3.9.2'
        jdk 'Java 17'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/s224605488/online-bookstore-api.git'
            }
        }

        stage('Build') {
            steps {
                bat '.\\mvnw.cmd clean install'
            }
        }

        stage('Run Tests') {
            steps {
                bat '.\\mvnw.cmd test'
            }
        }

        stage('Test Report') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }

        stage('Code Quality') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    bat '.\\mvnw.cmd sonar:sonar'
                }
            }
        }

        stage('Package') {
            steps {
                bat '.\\mvnw.cmd package'
            }
        }

        stage('Deploy') {
            steps {
                bat 'echo Simulating Deployment...'
            }
        }
    }
}
