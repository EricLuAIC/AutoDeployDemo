node {
    stage('Init ENV') {
        env.JAVA_HOME = "${java_home}"
        sh "echo \$JAVA_HOME"
        echo "gradle Path : ${gradleHome}"
        sh "git --version"
        sh "${gradle} -version"
        echo "------------------------------------------"
        sh "hostname"
        sh "whoami"
        sh "which java"
        echo "------------------------------------------"
        echo "current path: ${workspace}"
        echo "------------------------------------------"
        echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
        echo "BUILD_DISPLAY_NAME: ${env.BUILD_DISPLAY_NAME}"
        echo "JOB_NAME: ${env.JOB_NAME}"
        echo "NODE_LABELS: ${env.NODE_LABELS}"
        echo "WORKSPACE: ${env.WORKSPACE}"
        echo "JOB_URL: ${env.JOB_URL}"
    }
    stage('Checkout Git Source') {
        echo 'checkout from github'
    }
    stage('Build') {
        echo 'Build Source'
    }

    stage('Build') {
        echo 'Build Source'
    }
}