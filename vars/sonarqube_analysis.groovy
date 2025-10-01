def call(String SonarInstanceName, String Projectname, String ProjectKey){ 
  withSonarQubeEnv(SonarInstanceName) {
                    sh """
                        ${SONAR_HOME}/bin/sonar-scanner \
                        -Dsonar.projectName=${Projectname} \
                        -Dsonar.projectKey=${ProjectKey}
                    """
  }
}
