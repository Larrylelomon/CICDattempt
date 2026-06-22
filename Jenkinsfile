pipeline {
    agent any
    tools {
        maven 'mavenHome'
        jdk 'JavaHome'
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
                mvnd MainTest.java
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