package com.nopalyer.calculation


class calculate{

    companion object {
        fun plus(a: Int, b: Int): Int {
            return a + b
        }

        fun minus(a: Int, b: Int): Int {
            return a - b
        }


        fun divide(a: Int, b: Int): Int {
            require(b != 0) { "Divide by Zero Error" }
            return a/b
        }


        fun multiply(a: Int, b: Int): Int {
            return a * b
        }
    }
}