pipeline {
    agent any
    tools{
        maven 'Maven'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh '''
                cd cicd
                mvn -B -DskipTests clean package
                '''
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh '''
                cd cicd
                mvn test
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