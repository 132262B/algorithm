package com.algorithm.leetcode.twosum


/**
 * url : https://leetcode.com/problems/two-sum/
 */

fun main() {
    println(Solution().twoSum(intArrayOf(3,3), 6))
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed{ numIndex, numValue ->
            nums.forEachIndexed {nextIndex, nextValue ->
                if(numIndex == nextIndex) return@forEachIndexed
                val sum = numValue + nextValue
                if(sum == target) {
                    return intArrayOf(numIndex,nextIndex)
                }
            }
        }

        return intArrayOf(0,0)
    }
}