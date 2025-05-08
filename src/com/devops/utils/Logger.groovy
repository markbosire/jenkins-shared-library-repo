package com.devops.utils

class Logger {
    // Add script parameter to access pipeline steps
    static void info(def script, String message) {
        script.echo "[INFO] ${new Date()}: ${message}"
    }
}
