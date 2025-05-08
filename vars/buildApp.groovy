def call(Map config) {
    node {
        // Fixed: Added full package path
        com.devops.utils.Logger.info("Building ${config.appName} with version ${config.version}")
        sh "mvn clean package -Dversion=${config.version}"
    }
}
