package com.example.hardts.myapplication

open class Foo

interface Bar {
    val lazyLoadedString : String
}

class Test {
    private val foo : Foo by lazy {
        object : Foo(), Bar {
            override val lazyLoadedString = "Demo"
        }
    }
}
