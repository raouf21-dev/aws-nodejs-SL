#!/usr/bin.env groovy

def call(script) {
    echo "Testing pipeline..."
    echo "BRANCH_NAME: ${env.BRANCH_NAME}"
    return env.BRANCH_NAME == "main"
}