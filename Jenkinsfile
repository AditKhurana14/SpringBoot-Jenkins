pipeline {
    agent any

    tools {
        maven 'Maven 3.8.5'
        jdk 'JDK 11'
    }

    environment {
        JAR_NAME = 'target/*.jar'
    }

  stages{
      stage('Checkout'){
          steps{
             git 'https://github.com/AditKhurana14/SpringBoot-Jenkins'
          }
      }
      stage('Build'){
          steps{
              sh 'mvn clean install'
          }
      }
  }
  }