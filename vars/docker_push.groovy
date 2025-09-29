def call(String imageName, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerHubUsername')]) {
      sh "docker login -u ${dockerHubUsername} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerHubUsername}/${imageName}:${ImageTag}"
}
