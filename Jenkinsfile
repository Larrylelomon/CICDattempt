pipeline {
    agent any
    tools{
        maven 'maven'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh '''
                mvn -B -DskipTests clean package
                '''
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh '''
                mvn MainTest.java
                '''
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}