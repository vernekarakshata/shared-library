def call(def to, def from, def cc, def bcc, def replyTo) {
//	echo "Hello ${emailTemplate}"
  
  mail bcc: '', 
       body: "<b>Project Build Status</b>" + 
                "<br><br>Please find below the project details:" +
                "<table>" + 
                "<tr><td>Project</td><td>${env.JOB_NAME}</td></tr>" +
                "<tr><td>Build Number</td><td>${env.BUILD_NUMBER}</td></tr>" +
                "<tr><td>Project Deployment URL</td><td>${env.BUILD_URL}</td></tr></table>",
       cc: "${cc}",
       charset: 'UTF-8',
       from: "${from}",
       mimeType: 'text/html',
       replyTo: "${replyTo}",
       subject: "Project ${env.JOB_NAME} deployment '${currentBuild.currentResult}'", 
       to: "${to}";
  
  
  
  
  /*
  mail bcc: '', 
            body: "<b>Project Build Status</b>" + 
                "<br><br>Please find below the project details:" +
                "<table>" + 
                "<tr><td>Project</td><td>${env.JOB_NAME}</td></tr>" +
                "<tr><td>Build Number</td><td>${env.BUILD_NUMBER}</td></tr>" +
                "<tr><td>Project Deployment URL</td><td>${env.BUILD_URL}</td></tr></table>",
            cc: '', 
            charset: 'UTF-8', 
            from: '', 
            mimeType: 'text/html', 
            replyTo: '', 
            subject: "Project ${env.JOB_NAME} deployment '${currentBuild.result}'", 
            to: "akshatav10@gmail.com";*/
}
