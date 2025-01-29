fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }
    println(newList) // Output: [1, 2]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.filterValues { it <= 2 }
    println(newMap) // Output: {a=1, b=2}
    
    //Alternative approach using iterator
    val list2 = mutableListOf(1,2,3,4,5)
    val iterator = list2.iterator()
    while(iterator.hasNext()){
        if(iterator.next() > 2) iterator.remove()
    }
    println(list2) //Output: [1,2]
}