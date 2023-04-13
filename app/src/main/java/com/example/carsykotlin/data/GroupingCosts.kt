package com.example.carsykotlin.data

sealed class CostListItem() {
    class CostGeneralItem(val cost: Cost) : CostListItem()
    class CostDateItem(val date: String) : CostListItem()
    class CostYearItem(val date: String) : CostListItem()
}