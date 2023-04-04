package com.example.jettipapp.ut

fun calculateTotalTip(totalBill: Double, tipPercentage: Int): Float {
    return if (totalBill > 1 && totalBill.toString().isNotEmpty())
        ((totalBill  * tipPercentage) / 100).toFloat() else 0.0F
}

fun calculateTotalPerPerson(
    totalBill: Double,
    splitBy: Int,
    tipPercentage: Int
): Double{
    val bill = calculateTotalTip(totalBill = totalBill, tipPercentage = tipPercentage) + totalBill
    return (bill / splitBy )



}