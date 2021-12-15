node {

    def gradleHome = tool name: 'gradle6.7.1', type: 'gradle'
    def gradle = "${gradleHome}/bin/gradle"
    def nodeHome = tool name: 'nodeJs13', type: 'nodejs'
    def node = "${nodeHome}/bin/node"
    def npm = "${nodeHome}/bin/npm"

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
        // git設定
        def gitBranch = 'master'
        def gitCredentialsId = 'github'
        def gitUrl = 'https://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@github.com/EricLuAIC/AutoDeployDemo.git'
        echo 'checkout from github'
        checkout([
                $class: 'GitSCM',
                branches: [[name: "*/${gitBranch}"]],
                doGenerateSubmoduleConfigurations: false,
                extensions: [],
                submoduleCfg: [],
                userRemoteConfigs: [[credentialsId: "${gitCredentialsId}", url: "${gitUrl}"]]
        ])
    }
    stage('Build') {
        echo 'Build Source'
    }

    stage('Build') {
        echo 'Build Source'
    }
}