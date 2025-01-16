def call (dockerhubcred, projectname, imagetag, dockerhubuser) {
 withCredentials([usernamePassword(credentialsId:"dockerhubcred", usernameVariable:"dockerhubuser", passwordVariable:"dockerhubpass")]){
                sh "docker login -u ${env.dockerhubuser} -p ${env.dockerhubpass}"
                sh "docker image tag ${projectname} ${env.dockerhubuser}/${projectname}:${imagetag}"
                sh "docker push ${env.dockerhubuser}/${projectname}:${imagetag}"
                }

  
}
