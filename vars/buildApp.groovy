def call(Map config) {
    node {
        Logger.info("Building ${config.appName} with version ${config.version}")
        sh "mvn clean package -Dversion=${config.version}"
    }
}
