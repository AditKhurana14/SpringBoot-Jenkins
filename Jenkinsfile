pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
        stage('Build Docker Image ') {
            steps {
               bat 'docker build -t Springboot-Jenkins:latest .'
            }
        }
    }

    post {
        success {
            echo "✅ Build and archive successful."
        }
    }
}
