val n = scala.io.StdIn.readInt

var fubNum=new Array[Int](n+1)
fubNum(0)=1
fubNum(1)=1
for (i<-2 to n) {
    fubNum.update(i, (fubNum(i-1) + fubNum(i-2)))
}

println(fubNum(n-1))