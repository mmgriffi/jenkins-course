 job('NodeJS example') { 
    scm { 
        git('git://github.com/mmgriffi/docker-nodejs-demo.git') {  node -> 
            node / gitConfigName('DSL User') 
            node / gitConfigEmail('michaelmgriffin82@gmail.com') 
        } 
    } 
    triggers { 
        scm('H/5 * * * *') 
    } 
    wrappers { 
        nodejs('nodejs') // this is the name of the NodeJS installation in  
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name 
    } 
    steps { 
        shell("npm install") 
    } 
}