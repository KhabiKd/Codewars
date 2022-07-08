/* DESCRIPTION
  The prime numbers are not regularly spaced. For example from 2 to 3 the step is 1. From 3 to 5 the step is 2. From 7 to 11 it is 4.

  We will write a function step with parameters:  
  g (integer >= 2) which indicates the step we are looking for,
  m (integer >= 2) which gives the start of the search (m inclusive),
  n (integer >= m) which gives the end of the search (n inclusive)

  In the example above step(2, 2, 50) will return [3, 5] which is the first pair between 2 and 50 with a 2-steps.

  So this function should return the first pair of the two prime numbers spaced with a step of g between the limits m,
  n if these g-steps prime numbers exist otherwise nil or null or None or Nothing or [] or "0, 0" or {0, 0} or 0 0 or "" (depending on the language).

  Examples:
  step(2, 5, 7) --> [5, 7] or (5, 7) or {5, 7} or "5 7"

  step(4, 130, 200) --> [163, 167] or (163, 167) or {163, 167}
*/

package step

import java.util.Arrays

// if these g-steps prime numbers don't exist return []
fun step(g:Int, m:Long, n:Long):LongArray {
    val list = (m..n).toMutableList()
    var flag1 = false
    var flag2 = false
    var nextNum = 0L
    for(i in list){
        flag1 = false
        flag2 = false
        for(j in 2..i/2){
            if(i%j==0L){
                flag1 = true
                break
            }
        }

        if(!flag1) {
            nextNum = i + g
            for (k in 2..nextNum/2){
                if(nextNum%k==0L){
                    flag2 = true
                    break
                }
            }
            if(!flag2) { return listOf(i, nextNum).toLongArray() }
        }
    }

    return longArrayOf()
}
