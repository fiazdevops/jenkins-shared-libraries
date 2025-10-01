def call(String SonarInstance, String Projectname, String ProjectKey){ 
  withSonarQubeEnv("SonarQubInstance") {
                    sh """
                        ${SONAR_HOME}/bin/sonar-scanner \
                        -Dsonar.projectName=${Projectname} \
                        -Dsonar.projectKey=${ProjectKey}
                    """
}
