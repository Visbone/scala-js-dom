
@main
def Main = 
    println("hi")
    val i:Int = 0
    for 
        i <- 1 to 10 
        j <- 1 to 10
    do 
        println( (i, j) ) 
    tools


import scala.scalajs.js

object tools:
    val document = js.Dynamic.global.document
    val window = js.Dynamic.global.window
    val canvas = document.getElementById("canvas")
    canvas.width = window.innerWidth
    canvas.height = window.innerHeight
    var ctx = canvas.getContext("2d")
    ctx.beginPath();
    ctx.rect(20, 20, 150, 100)
    ctx.stroke()