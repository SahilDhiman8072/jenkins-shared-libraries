def call(String dockeruser,String image_name,String tag_name){
  sh "docker build -t ${dockeruser}/${image_name}:${tag_name} ."
}
