pipeline{
    agent any
    stages{
        stage("Clone"){
            steps{
                git credentialsId: '83e3f19a-1b95-41c0-a3f5-117f475d8aaa', url: 'https://github.com/dpradhan565/version.git'
            }
        }
        stage("Update Properties"){
            steps{
                bat "mvn versions:update-properties"
            }
        }
          stage("Push"){
            steps{
              
                bat '''git add .
                git commit -m "push to git"
                git push --set-upstream origin master'''
                
            }
        }
        
    }
}
