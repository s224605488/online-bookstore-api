pipeline {
    agent any

    tools {
        maven 'Maven 3.9.2'
        jdk 'Java 17'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/s224605488/online-bookstore-api.git'
            }
        }

        stage('Build') {
            steps {
                sh './mvnw clean install'
            }
        }

        stage('Run Tests') {
            steps {
                sh './mvnw test'
            }
        }

        stage('Package') {
            steps {
                sh './mvnw package'
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
