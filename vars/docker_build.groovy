def call(string dockeruser,string image_name,string tag_name){
  sh "docker build -t ${dockeruser}/${image_name}:${tag_name} ."
}
