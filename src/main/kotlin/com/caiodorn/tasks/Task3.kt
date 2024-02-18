package com.caiodorn.tasks

fun main() {
    val s1: String? = null
    val s2: String? = ""
    s1?.isEmptyOrNull() eq true // doesn't work, but this code was provided by the course, so...
    s2?.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false
}

fun String.isEmptyOrNull(): Boolean {
    return this == null || this.length == 0
}

// taken from Coursera, function does not exist
infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}
