def call(def giturl, def branch, def credentialId) {
	
	sh(script: "git branch: ${branch}, credentialsId: ${credentialId}, url: ${giturl}")
 }