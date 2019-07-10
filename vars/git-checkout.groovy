def call(def giturl, def branch, def credentialId) {
	echo "Git Checkout started"
	git branch: ${branch},
        credentialsId: ${credentialId},
        url: ${giturl}
 }