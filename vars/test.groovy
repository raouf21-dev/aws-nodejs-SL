#!/usr/bin.env groovy

def call(script){
        script.return env.BRANCH_NAME == "main"            
        script.echo "Testing pipeline..."
        script.echo "BRANCH_NAME: ${env.BRANCH_NAME}"
    }