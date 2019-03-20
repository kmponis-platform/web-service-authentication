# web-services-authentication
A java web-service to authenticate users.

## Prerequisites
* To run the application you need to have git, mvn and JDK8 installed.

## Download
* Open command line and move to your workspace.
* Download project using your username: 
<br>`> git clone https://github.com/kmponis-platform/web-service-authentication.git`
* Go to project: 
<br>`> cd /web-service-authentication`

## Run
* Open command line and move to your project.
* Go to the right branch (ex. develop)
<br>`> git checkout develop`
<br>**Localy Tomcat** 
<br>`TODO`
<br>**Dev Server Jenkins** 
<br>`TODO`
<br>**Prod Server Jenkins** 
<br>`TODO`

# General Info

## GIT Strategy
* Open command line and move to your workspace.
* Download project using your username: 
<br>`> git clone https://github.com/kmponis-platform/web-service-authentication.git`
* Go to develop branch
<br>`> git checkout develop`
* Create a slave branch - using the story number (ex. sml-9)
<br>`> git branch <newBranchName>`
* Select slave branch 
<br>`> git checkout <newBranchName>`
* Add slave branch to repository 
<br>`> git push --set-upstream origin <newBranchName>`
* When story is finished push and request a merge
* Pull changes from develop
<br>`> git checkout <newBranchName>`
<br>`> git fetch origin`
<br>`> git merge origin/develop`
<br>`> git push`