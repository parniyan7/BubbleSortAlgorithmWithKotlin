import java.util.Collections.swap

/*
*
* This is a sample project of Bubble sort Algorithm with Kotlin
* created by Parniyan Mousaie
*
* */

fun main(args: Array<String>) {
    fun main() {
        fun mySort(arr: List<Int>): List<Int> {
            var swappedElements : Boolean
            do {
                swappedElements = false
                for (i in 0..arr.size - 2){
                    if (arr[i] > arr[i + 1]){
                        swap(arr, i, i + 1)
                        swappedElements = true
                    }
                }
            } while (swappedElements)
            for(i in arr) println(i)
            return arr
        }
        mySort(listOf(1,10,4,6,15))
    }
}