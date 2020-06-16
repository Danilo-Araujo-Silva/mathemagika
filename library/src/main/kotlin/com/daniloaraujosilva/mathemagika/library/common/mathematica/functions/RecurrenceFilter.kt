package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RecurrenceFilter
 *
 * Full name:        System`RecurrenceFilter
 *
 *                   RecurrenceFilter[{α, β}, x] filters x using a linear recurrence equation with coefficients α and β.
 *                   RecurrenceFilter[tf, x] uses a discrete-time filter defined by the TransferFunctionModel tf.
 *                   RecurrenceFilter[…, x, {y , y  , …}] uses a specified list {y , y  , …} as the initial condition.
 *                                            0   -1                              0   -1
 *                   RecurrenceFilter[…, image] filters image.
 * Usage:            RecurrenceFilter[…, sound] filters sampled sound object.
 *
 * Options:          Padding -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RecurrenceFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/RecurrenceFilter.html
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
fun recurrenceFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RecurrenceFilter", arguments.toMutableList(), options)
}
