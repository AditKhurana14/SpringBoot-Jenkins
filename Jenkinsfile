pipeline {
    agent any



    environment {
        JAR_NAME = 'target/*.jar'
    }

  stages{
      stage('Checkout'){
          steps{
              checkout scm
          }
      }
      stage('Build'){
          steps{
              bat 'mvn clean install'
          }
      }
  }
  }