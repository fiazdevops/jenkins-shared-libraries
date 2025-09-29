def call(String gitUrl, String branch, String credentialsId) {
    git credentialsId: "${credentialsId}",
        url: "${gitUrl}",
        branch: "${branch}"
}

