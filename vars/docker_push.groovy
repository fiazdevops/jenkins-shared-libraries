def call(String imageName, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerHubUsername')]) {
      echo $dockerHubPass | docker login -u $dockerHubUsername --password-stdin
  }
  sh "docker push ${dockerHubUsername}/${imageName}:${ImageTag}"
}
