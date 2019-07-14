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
   /*
  rtMavenResolver (
    id: 'resolver-unique-id',
    serverId: 'Artifactory-1',
    releaseRepo: 'libs-release",
    snapshotRepo: 'libs-snapshot"
  )  
 
  rtMavenDeployer (
      id: 'deployer-unique-id',
      serverId: 'Artifactory-1',
      releaseRepo: 'libs-release-local',
      snapshotRepo: "libs-snapshot-local"
  )
  
  rtMavenRun (
    tool: MAVEN_TOOL,
    pom: 'maven-example/pom.xml',
    goals: 'clean install',
    // Maven options.
    opts: '-Xms1024m -Xmx4096m',
    resolverId: 'resolver-unique-id'
    deployerId: 'deployer-unique-id',
)*/
}
