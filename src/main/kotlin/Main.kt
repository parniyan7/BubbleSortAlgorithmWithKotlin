import java.util.Collections.swap
import kotlin.*

/*
*
* This is a sample project of Bubble sort Algorithm with Kotlin
* created by Parniyan Mousaie
*
* */

fun main(args: Array<String>) {
        fun mySort(list: List<Int>): List<Int> {
            var swappedElements : Boolean
            do {
                swappedElements = false
                for (i in 0..list.size - 2){
                    if (list[i] > list[i + 1]){
                        swap(list, i, i + 1)
                        swappedElements = true
                    }
                }
            } while (swappedElements)
            for(i in list) println(i)
            return list
        }
        mySort(listOf(1,10,4,6,15))
    }
