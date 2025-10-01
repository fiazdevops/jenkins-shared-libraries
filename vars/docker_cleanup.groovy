def call(String imageName, String ImageTag){
  sh "docker rmi -f ${imageName}:${ImageTag} || true"
}
