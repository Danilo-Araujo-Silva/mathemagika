package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             KnapsackSolve
 *
 * Full name:        System`KnapsackSolve
 *
 *                   KnapsackSolve[{cost , cost , …}, maxtotalcost] solves the knapsack problem of finding the maximum number of items associated with each of the cost , subject to the constraint that the total cost is not larger than maxtotalcost.
 *                                      1      2                                                                                                                       i
 *                   KnapsackSolve[{{payoff , cost }, {payoff , cost }, …}, maxtotalcost] finds a number of items that maximizes the total payoff, while satisfying the constraint on the total cost.
 *                                         1      1          2      2
 *                   KnapsackSolve[{{payoff , cost , maxcount }, …}, maxtotalcost] allows at most maxcount  copies of item i.
 *                                         1      1          1                                            i
 *                   KnapsackSolve[items, {maxtotalpayoff, maxtotalcost}] finds a result that gives a total payoff not larger than maxtotalpayoff.
 *                   KnapsackSolve[items, {maxtotalpayoff, maxtotalcost, maxtotalcount}] adds the constraint of having no more than maxtotalcount items in total.
 *                   KnapsackSolve[ label   itemspec , … , maxtotals] labels each type of item and gives the result as an association.
 * Usage:                                 1           1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KnapsackSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/KnapsackSolve.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun knapsackSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KnapsackSolve", arguments.toMutableList(), options)
}
