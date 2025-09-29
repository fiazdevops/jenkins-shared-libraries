def call(String url, String branch, String credentialsId){
  echo "🔄 Cloning from branch: ${GIT_BRANCH}"
  git credentialsId: "${credentialsId}",
      url: "${GitUrl}", branch: "${GIT_BRANCH}"
}
