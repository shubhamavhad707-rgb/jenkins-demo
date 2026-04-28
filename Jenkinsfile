pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
    post {
        success {
            echo 'Build Successful'
            archiveArtifacts artifacts: 'target/*.jar'
        }
        failure {
            echo 'Build Failed'
        }
        always {
            echo 'Pipeline Finished'
        }
    }
       
        }
    }
}