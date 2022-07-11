/** DESCRIPTION
Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

 "(p1**n1)(p2**n2)...(pk**nk)"
with the p(i) in increasing order and n(i) empty if n(i) is 1.

Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
*/

package solution

object PrimeDecomp {
    fun factors(l: Int): String {
    var decompose: String = "" // this is what fun return. Type: "(p1**n1)(p2**n2)...(pk**nk)"
    fun rec(l: Int, map: MutableMap<Int, Int>) {
        var count: Int = 0
        if (l > 1) {
            for (i in 2..l) {
                if (l % i == 0) {
                    if(map[i] != null) { count = map[i]!! }
                    count++
                    map[i] = count
                    rec(l / i, map)
                    break
                }
            }
        }
    }
    val map = mutableMapOf<Int, Int>()
    rec(l, map)
    for(i in map.keys) {
        if (map[i] != 1) {
          decompose = decompose.plus("($i**${map[i]})")
        }
        else decompose = decompose.plus("($i)")
    }

    return decompose
  }
}
