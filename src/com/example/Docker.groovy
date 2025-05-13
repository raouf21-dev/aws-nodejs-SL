#!/usr/bin.env groovy

package com.example

class Docker implements Serializable {
    def script 

    Docker(script){
        this.script = script
    }

    def buildDockerImage(String imageName){
        script.echo "building the docker image..."
        script.sh "docker build --platform linux/amd64 -t $imageName ." 
        script.echo "Listing Docker images..."
        script.sh "docker images | grep $imageName || true" 
    }

    def pushDockerImage(String imageName){
        echo "Pushing Image..."
        withCredentials([script.usernamePassword(script.credentialsId: "docker-hub-creds", script.passwordVariable: "PASS", script.usernameVariable: "USER")]){
            script.sh "echo $PASS | docker login -u $USER --password-stdin"
            script.sh "docker push $IMAGE_NAME" 
        }
    }
}