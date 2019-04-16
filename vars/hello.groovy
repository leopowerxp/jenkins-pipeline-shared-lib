def call(some_words, bbb){
    println "Hello $some_words $bbb!!"
    sh "export"
    println env.AAA
    return ["finished", "para2"]
}
