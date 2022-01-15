def call() {
  timeout(time: 1, unit: 'HOURS') {
    def qg = waitForQualityGate()
    
    if (qg.status != 'OK') {
      error "Quality Gate failure: ${qg.status}"
    }
  }
}
