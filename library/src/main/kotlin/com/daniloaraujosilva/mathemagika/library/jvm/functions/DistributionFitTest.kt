package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DistributionFitTest
 *
 * Full name:        System`DistributionFitTest
 *
 *                   DistributionFitTest[data] tests whether data is normally distributed.
 *                   DistributionFitTest[data, dist] tests whether data is distributed according to dist.
 * Usage:            DistributionFitTest[data, dist, "property"] returns the value of "property".
 *
 *                   Method -> Automatic
 *                                        1
 *                   SignificanceLevel -> --
 * Options:                               20
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DistributionFitTest
 * Documentation:    web: http://reference.wolfram.com/language/ref/DistributionFitTest.html
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
fun distributionFitTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DistributionFitTest", arguments.toMutableList(), options)
}
