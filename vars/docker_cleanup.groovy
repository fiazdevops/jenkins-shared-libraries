def call(String imageName, ImageTag){
  sh "docker rmi -f ${imageName}:${ImageTag} || true"
}
