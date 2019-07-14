def call(def maventool, def pom, def mavenGoals, def artifactoryServerId,  
          def resolverId, def resolverReleaseRepo, def resolversnapshotRepo,
          def deployerId, def deployerReleaseRepo, def deployersnapshotRepo) {
          
          
  echo "maventool ${maventool}"
  echo "pom ${pom}"
  echo "mavenGoals ${mavenGoals}"
  echo "artifactoryServerId ${artifactoryServerId}"
  echo "resolverId ${resolverId}"
  echo "resolverReleaseRepo ${resolverReleaseRepo}"
  echo "resolversnapshotRepo ${resolversnapshotRepo}"
  echo "deployerId ${deployerId}"
  echo "deployerReleaseRepo ${deployerReleaseRepo}"
  echo "deployersnapshotRepo ${deployersnapshotRepo}"

  rtMavenResolver (
    id: '"${resolverId}"',
    serverId: '"${artifactoryServerId}"',
    releaseRepo: '"${resolverReleaseRepo}"',
    snapshotRepo: '"${resolversnapshotRepo}"'
  )  
 
  rtMavenDeployer (
      id: '"${deployerId}"',
      serverId: '"${artifactoryServerId}"',
      releaseRepo: '"${deployerReleaseRepo}"',
      snapshotRepo: '"${deployersnapshotRepo}"'
  )
  
  rtMavenRun (
    tool: "${maventool}",
    pom: '"${pom}"',
    goals: '"${mavenGoals}"',
    // Maven options.
    opts: '-Xms1024m -Xmx4096m',
    resolverId: '"${resolverId}"',
    deployerId: '"${deployerId}"',
  )
}
