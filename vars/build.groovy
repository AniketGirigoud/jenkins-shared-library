def call (string projectname, string imagetag) {
 sh "docker build -t ${projectname}:${imagetag}
}
