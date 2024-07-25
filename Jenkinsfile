pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "jenkin_maven"
    }


    stages {
        stage('Build') {
            steps {
                git url: ' https://github.com/Snehal8340/TestDemo1.git', branch: 'main'
                sh 'mvn test'
            }
        }
    }

    post {
        success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
        }
    }
}
