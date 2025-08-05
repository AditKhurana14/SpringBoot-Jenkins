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
        stage('Build & Test') {
            steps {
               bat 'mvn clean verify '
            }
        }

        stage('Publish Coverage') {
            steps {
                jacoco()
            }
        }

        stage('Build Docker Image ') {
            steps {
               bat 'docker build -t Springboot-Jenkins:latest .'
            }
        }
        stage('Tag Docker Image  ') {
            steps {
                bat 'docker Springboot-Jenkins:latest aditkhurana14/dockerimage '
            }
        }
        stage('Push Docker Image  ') {
            steps {
                bat 'docker push aditkhurana14/dockerimage '
            }
        }
    }

    post {
        success {
            echo "✅ Build and archive successful."
        }
    }
}
