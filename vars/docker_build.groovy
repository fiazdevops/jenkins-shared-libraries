// Define function
def call(String imageName, String ImageTag, String dockerHubUsername){
  sh "docker build -t ${dockerHubUsername}/${imageName}:${ImageTag} ."
}
