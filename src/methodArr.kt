fun main(args: Array<String>) {
    //Array  method
    //sort()
    val simpsonsA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Marggie")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print (simpson + ' ')
    }
    print('\n')

    //sorted
    val simpsonsB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Marggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted){
        print(simpson + ' ')
    }
    print('\n')

    //reserve() and reversedArray()
    val simpsonsC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Marggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + ' ')
    }
    print('\n')

    //indexOf()
    val simpsonsD: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Marggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, thet's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpson")
    }

    val simpsonsE: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Marggie")
    println("simsons size: "+ simpsonsE.size)
    if(!simpsonsE.isEmpty())
        println("Array tidak kosong!")
    println("Min = "+ simpsonsE.min())
    println("Max = "+simpsonsE.max())
    println("First = "+simpsonsE.first())
    println("Last = "+simpsonsE.last())
    println(simpsonsE.contains("Marge"))
}