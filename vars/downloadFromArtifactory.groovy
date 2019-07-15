def call(def pattern, def downloadDir, def serverID) {
  /*def server = "${serverID}"
  def downloadSpec = """{
       "files": [
          {
              "pattern": "${pattern}",
              "target": "${downloadDir}",
              "flat":true
          }
      ]
  }"""
  server.download(downloadSpec)
  */
  
  rtDownload (
    serverId: "${serverID}",
    spec:
        """{
          "files": [
            {
             "pattern": "${pattern}",
              "target": "${downloadDir}",
              "flat":true
            }
         ]
        }"""
)
}
