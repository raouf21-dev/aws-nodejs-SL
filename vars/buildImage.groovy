#!/usr/bin.env groovy

import src.com.example

def call(imageName){
    return new Docker(this).buildDockerImage(imageName)
}