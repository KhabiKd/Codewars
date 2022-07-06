/* DESCRIPTION
  The two oldest ages function/method needs to be completed. It should take an array of numbers as its argument and return the two highest numbers within the array.
  The returned value should be an array in the format [second oldest age, oldest age].
  
  The order of the numbers passed in could be any order. The array will always include at least 2 items.
  If there are two or more oldest age, then return both of them in array format.

  For example (Input --> Output):

  [1, 2, 10, 8] --> [8, 10]
  [1, 5, 87, 45, 8, 8] --> [45, 87]
  [1, 3, 10, 0]) --> [3, 10]
*/

package solution

fun main(){
    println(twoOldestAges(listOf(1,5,87,45,8,8)))
}

fun twoOldestAges(ages: List<Int>): List<Int> {
    val l = ages.sorted()
    val first = l[l.size-1]
    val second = l[l.size - 2]
    val n = listOf(second, first)
    return n
}
