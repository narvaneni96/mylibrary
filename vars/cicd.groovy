def newGit(repo)
{
   git "${repo}"
}
def newMaven(repo)
{
   sh 'mvn package'
}
