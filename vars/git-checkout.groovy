def call(def giturl, def branch, def credentialId) {
//	git branch: '${branch}', credentialsId: '${credentialId}', url: '${giturl}'
//	git([url: ${giturl}, branch: ${branch}, credentialsId: ${credentialId}])

checkout([$class: 'GitSCM', 
    branches: [[name: '*/master']], 
    doGenerateSubmoduleConfigurations: false, 
    extensions: [[$class: 'CleanCheckout']], 
    submoduleCfg: [], 
    userRemoteConfigs: [[credentialsId: '5bd19c27-30a1-42d9-9f82-2d62eb81e2ac', url: 'https://github.com/vernekarakshata/Inventory-Jenkins.git']]
])




}
