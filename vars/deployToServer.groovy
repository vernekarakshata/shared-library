def call(def source, def user, def hostname, def destination) {
    sh "scp ${source} ${user}@${hostname}:${destination}"
}
