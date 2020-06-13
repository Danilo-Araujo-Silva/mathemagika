package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ArrayResample
 *
 * Full name:        System`ArrayResample
 *
 *                   ArrayResample[array, {n , n , …}] resamples array to have dimensions {n , n , …}.
 *                                          1   2                                           1   2
 *                   ArrayResample[array, dspec] resamples array according to the dimension specification dspec.
 *                   ArrayResample[array, dspec, scheme] specifies resampling scheme, either point or bin based.
 *                   ArrayResample[array, dspec, scheme, {{x   , x   }, …}] resamples only the data in the specified subrange {{x   , x   }, …}.
 * Usage:                                                   min   max                                                            min   max
 *
 *                   Antialiasing -> False
 *                   DataRange -> Automatic
 *                   Padding -> Fixed
 * Options:          Resampling -> Linear
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ArrayResample
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArrayResample.html
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
fun arrayResample(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArrayResample", arguments.toMutableList(), options)
}
