def call(String username,String image_name,String tag_name){
  withCredentials([usernamePassword(credentialsId:"DockerhubCred",usernameVariable:"dockerhubuser",passwordVariable:"dockerhubpass")]){
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
    sh "docker push ${username}/${image_name}:${tag_name}"
  }
}
