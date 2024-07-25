pipeline {
    agent any

    tools {
        maven "jenkin_maven"
    }

    stages {
        stage('Build') {
            steps {

                git 'https://github.com/Snehal8340/TestDemo1.git'
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
