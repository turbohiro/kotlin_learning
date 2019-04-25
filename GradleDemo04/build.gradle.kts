plugins{
    application
}

//查看工作量 把源文件写入到一个文件中
task("拷贝工作量"){
    //没有指定输入源和输出源
    inputs.dir("src")
    outputs.file("info.txt")
    doFirst{
        val dir = fileTree("src")
        //接收文件 info.txt
        val infoTxt = File("info.txt")
        dir.forEach{
            if(it.isFile){
                infoTxt.appendText(it.name)
                infoTxt.appendText("\n")
            }
        }
    }
}