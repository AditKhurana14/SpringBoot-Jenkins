pipeline {
    agent any



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