#!/usr/bin.env groovy

def call(imageName){
    return new Docker(this).buildDockerImage(imageName)
}