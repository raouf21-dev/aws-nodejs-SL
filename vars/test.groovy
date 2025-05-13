#!/usr/bin.env groovy

def call(script){
        // script.echo "Testing pipeline..."
        // script.echo "BRANCH_NAME: ${script.env.BRANCH_NAME}"
        return script.env.BRANCH_NAME == "main"            
    }