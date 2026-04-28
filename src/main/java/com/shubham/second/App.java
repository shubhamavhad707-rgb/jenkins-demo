package com.shubham.second;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Jenkins Auto build Pipeline!" );
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
