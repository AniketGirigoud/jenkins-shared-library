def call (projectname, imagetag) {
 sh "docker build -t ${projectname}:${imagetag} ."
}
