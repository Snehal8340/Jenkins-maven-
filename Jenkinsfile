pipeline {
    agent any

    tools {
       
        maven "MVN_HOME"
    }

    stages {
        stage('Build') 
         {
            steps {
                
                git 'https://github.com/Snehal8340/Jenkins-maven-.git'

                sh "mvn -Dmaven.test.failure.ignore=true clean package"
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
