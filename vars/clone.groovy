def call(String url, String branch){
   echo 'This is cloning the code'
    dir('E:/D/Jenkins/Projects/django-notes-app') {
        git url: ${url}, branch: ${branch}
    }
    echo 'cloning the code successfully'
}
