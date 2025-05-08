def call(Map config) {
    node {
        // Now passing 'this' for script context
        com.devops.utils.Logger.info(this, "Building ${config.appName} with version ${config.version}")
     
    }
}
