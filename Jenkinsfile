pipeline {
    agent any

    environment {
        // Set environment variables if needed
    }

    stages {
        stage('Checkout') {
            steps {
                git url: ' https://github.com/Snehal8340/TestDemo1.git', branch: 'main'
            }
        }
        
        stage('Install Dependencies') {
            steps {
                sh 'mvn install'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.json', allowEmptyArchive: true
            junit 'target/cucumber-reports/*.xml'
        }
    }
}
