def call(String imageName, String imageTag){
    // File system scan
    sh "trivy fs --format table -o trivy-fs-report.html ."
    // Docker image scan
    sh "trivy image --format table -o trivy-image-report.html ${imageName}:${imageTag} || true"
} 
