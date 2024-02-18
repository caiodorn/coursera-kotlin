package com.caiodorn.tasks

/**
 * Implement the function that checks whether a string is a valid identifier. A valid identifier is a non-empty string
 * that starts with a letter or underscore and consists of only letters, digits and underscores.
 */
fun isValidIdentifier(s: String): Boolean {
    fun remainingCharsAreValid(ss: String): Boolean {
        var isValid = true
        for (c in ss) {
            isValid = isValid && (c.isLetterOrDigit() || c == '_')
        }
        return isValid
    }

    val beginsWithValidChar = s.isNotEmpty() && (s[0].isLetter() || s[0] == '_')

    return beginsWithValidChar && remainingCharsAreValid(s)
}

fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}