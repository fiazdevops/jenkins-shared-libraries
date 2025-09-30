def call(String Sonar, String imageName, String imageName){ 
  withSonarQubeEnv('Sonar') {
                    sh """
                        ${SONAR_HOME}/bin/sonar-scanner \
                        -Dsonar.projectName=${imageName} \
                        -Dsonar.projectKey=${imageName}
                    """
}
