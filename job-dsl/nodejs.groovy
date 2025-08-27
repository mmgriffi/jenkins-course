 job('NodeJS example') { 
    scm { 
        git('https://github.com/mmgriffi/docker-demo.git') {  node -> 
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
        cmd("npm install")  // it was bash("npm install") before
    } 
}