def call(def source, def user, def hostname, def destination) {
    echo "scp ${source} ${user}@${hostname}:${destination}"
    sh "scp ${source} ${user}@${hostname}:${destination}"
}
