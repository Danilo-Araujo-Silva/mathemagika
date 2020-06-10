package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HistogramList
 * 
 * Full name:        System`HistogramList
 * 
 *                   HistogramList[{x , x , …}] gives a list of bins and histogram heights of the values x .
 *                                   1   2                                                                i
 *                   HistogramList[{{x , y , …}, {x , y , …}, …}] gives a list of bins and histogram heights of the values {x , y , …}.
 *                                    1   1        2   2                                                                     i   i
 *                   HistogramList[…, bspec] gives a list of bins and histogram heights with bins specified by bspec.
 * Usage:            HistogramList[…, bspec, hspec] gives a list of bins and histogram heights with bin heights computed according to the specification hspec.
 * 
 *                   Method -> Automatic
 * Options:          TargetUnits -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HistogramList
 * Documentation:    web: http://reference.wolfram.com/language/ref/HistogramList.html
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
fun histogramList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HistogramList", arguments.toMutableList(), options)
}
