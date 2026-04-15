def call(string username,string image_name,string tag_name){
  withCredentials([usernamePassword(credentialsId:"DockerhubCred",usernameVariable:"dockerhubuser",passwordVariable:"dockerhubpass")]){
    sh "docker login -u ${env.dockerhubuser} -p ${env.dockerhubpass}"
    sh "docker push ${username}/${image_name}:${tag_name}"
  }
}
