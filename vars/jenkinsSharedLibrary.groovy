def docker_login (){
    sh "echo hello world"
    withCredentials([usernamePassword(credentialsId: 'docker_hub',  usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]){
        sh "docker login -u ${USERNAME} -p ${PASSWORD}"
    } 
}
