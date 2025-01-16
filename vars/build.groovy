def call (string projectname, string imagetag, string dockerhubuser) {
 sh "docker build -t ${dockerhubuser}/${projectname}:${imagetag} ."
}
