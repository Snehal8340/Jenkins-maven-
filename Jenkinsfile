pipeline {
    agent any

    environment {
        // Set any environment variables if needed
        jenkin_maven = tool name: 'Maven', type: 'hudson.tasks.Maven$MavenInstallation'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub
                git url: 'https://github.com/Snehal8340/TestDemo1.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                // Run Maven clean and install
                withMaven(maven: 'Maven') {
                    sh "${jenkin_maven}/bin/mvn clean install"
                }
            }
        }
    }
}
        stage('Test') {
            steps {
                // Run tests
                withMaven(maven: 'Maven') {
                    sh "${jenkin_maven}/bin/mvn test"
                }
            }
        }

        stage('Deploy') {
            steps {
                // Deploy the application or artifacts if needed
                // Example: sh "${jenkin_maven}/bin/mvn deploy"
            }
        }
    }

    post {
        always {
            // Archive artifacts, publish test results, etc.
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            junit 'target/surefire-reports/*.xml'
        }
    }
}
