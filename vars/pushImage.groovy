#!/usr/bin.env groovy

import com.example.Docker

def call(imageName){
    return new Docker(this).pushDockerImage(imageName)
}