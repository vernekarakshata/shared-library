def call(def maventool, def pom, def mavenGoals, def artifactoryServerId,  
          def deployerId, def deployerReleaseRepo, def deployersnapshotRepo) {
         
  rtMavenDeployer (
      id: "${deployerId}",
      serverId: "${artifactoryServerId}",
      releaseRepo: "${deployerReleaseRepo}",
      snapshotRepo: "${deployersnapshotRepo}"
  )
  
  rtMavenRun (
    tool: "${maventool}",
    pom: "${pom}",
    goals: "${mavenGoals}",
    opts: '-Xms1024m -Xmx4096m',
    deployerId: "${deployerId}",
  )
  
  rtPublishBuildInfo (
    serverId: "${artifactoryServerId}"
)
  
 
}
