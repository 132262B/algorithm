package com.algorithm.leetcode.palindrome_number

/**
 * url : https://leetcode.com/problems/palindrome-number
 */
fun main() {
    Solution().isPalindrome(-1)
}

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val a = x.toString()
        val b = x.toString().reversed()
        return a==b
    }
}