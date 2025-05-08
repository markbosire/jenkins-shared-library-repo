package com.devops.utils

class Logger {
    static void info(String message) {
        echo "[INFO] ${new Date()}: ${message}"
    }
}
