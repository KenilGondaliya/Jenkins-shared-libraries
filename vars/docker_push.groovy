def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
      bat "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  bat "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
