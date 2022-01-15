# shared-library
### Shared Library for Jenkins Pipeline Process

shared-library is project which supports "Jenkins Shared Libraries" structure and can be directly use as an source control repository and used with existing pipelines.

This was mainly used while learning complete CI-CD-CT process through a jenkinsfile. 

## Features Implemented

Below are list of different functions implemeted to be used in simple CI/CD pipeline.

| Process | Links |
| ------ | ------ |
| Hello User | [helloUser.groovy](vars/helloUser.groovy) |
| Git Checkout | [gitCheckout.groovy](vars/gitCheckout.groovy) |
| SonarQube analysis and Quality Gate | [sonarqubeAnalysis.groovy](vars/sonarqubeAnalysis.groovy), [checkQualityGate.groovy](vars/checkQualityGate.groovy) |
| Maven Build and Deploy the artifacts and publish build info | [mavenDeploy.groovy](vars/mavenDeploy.groovy) |
| Create Docker Image & Publich to Docker Hub | [dockerBuildImagePushToHub.groovy](vars/dockerBuildImagePushToHub.groovy) |
| Download From Artifactory | [downloadFromArtifactory.groovy](vars/downloadFromArtifactory.groovy) |
| Deploy To Server | [deployToServer.groovy](vars/deployToServer.groovy) |
| Send Mail | [sendMail.groovy](vars/sendMail.groovy) |


### Note
We require to configure respective tools and jenkins plugins in jenkins server as per requirement. 
