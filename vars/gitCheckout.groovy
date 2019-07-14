def call(def giturl, def branch, def credentialId) {
//	git branch: '${branch}', credentialsId: '${credentialId}', url: '${giturl}'
//	git([url: ${giturl}, branch: ${branch}, credentialsId: ${credentialId}])

echo "giturl ${giturl}"
echo "branch ${branch}"
echo "credentialId ${credentialId}"

checkout([$class: 'GitSCM', 
    branches: [[name: "${branch}"]], 
    doGenerateSubmoduleConfigurations: false, 
    extensions: [[$class: 'CleanCheckout']], 
    submoduleCfg: [], 
          userRemoteConfigs: [[url: "${giturl}"]]
//    userRemoteConfigs: [[credentialsId: "${credentialId}", url: "${giturl}"]]
])




}
