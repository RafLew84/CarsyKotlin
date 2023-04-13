package com.example.carsykotlin.data

import com.example.carsykotlin.util.polishMonthsNames
import java.time.LocalDate
import java.time.Month
import java.time.format.TextStyle
import java.util.*
import kotlin.random.Random

object DataProvider {

    private val generalCosts = List(500) {
        Cost(
            CostType.values()[Random.nextInt(CostType.values().size)],
            LocalDate.of(Random.nextInt(2005, 2023), Random.nextInt(1,13), Random.nextInt(1,28)),
            Random.nextInt(5000)
        )
    }

    fun getTimeLineList() = generalCosts
            .sortedBy { it.date }
            .groupBy { it.date.year }
            .flatMap { (year, costsOfYear) -> costListItemsByMonths(year, costsOfYear) }

    private fun costListItemsByMonths(
        year: Int,
        costsOfYear: List<Cost>
    ) = listOf(
        CostListItem.CostYearItem(year.toString()),
        *costsOfYear.groupBy { it.date.month }
            .flatMap { (month, costsOfMonth) -> costListItemsByDays(month, costsOfMonth) }
            .toTypedArray()
    )

    private fun costListItemsByDays(
        month: Month,
        costsOfMonth: List<Cost>
    ) = listOf(
        CostListItem.CostMonthItem(polishMonthsNames(month)),
        *costsOfMonth.sortedBy { it.date.dayOfMonth }
            .map { CostListItem.CostGeneralItem(it) }
            .toTypedArray()
    )
}