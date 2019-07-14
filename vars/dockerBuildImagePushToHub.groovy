    
def call(def registoryName, def tagName, def registoryCredential) {

  def dockerImage = ''
  dockerImage = docker.build "${registoryName}" + ":${tagName}"
   docker.withRegistry( '', "${registoryCredential}" ) {
      dockerImage.push()
   }
   sh "docker rmi ${registoryName}:${tagName}"
	
}
