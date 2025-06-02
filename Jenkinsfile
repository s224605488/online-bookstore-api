pipeline {
    agent any

triggers {
        GenericTrigger(
            causeString: 'Triggered by GitHub Webhook',
            token: 'bookstore-trigger',
            printContributedVariables: true,
            printPostContent: true
        )
    }

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

        stage('Package') {
            steps {
                bat '.\\mvnw.cmd package'
            }
        }
    }
}
