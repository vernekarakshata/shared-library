def call(def giturl, def branch, def credentialId) {
//	git branch: '${branch}', credentialsId: '${credentialId}', url: '${giturl}'
	git([url: ${giturl}, branch: ${branch}, credentialsId: ${credentialId}])
}
