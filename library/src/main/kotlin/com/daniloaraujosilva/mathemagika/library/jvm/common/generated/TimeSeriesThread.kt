package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TimeSeriesThread
 * 
 * Full name:        System`TimeSeriesThread
 * 
 *                   TimeSeriesThread[f, {tseries , tseries , …}] combines the tseries  using the function f.
 * Usage:                                        1         2                          i
 * 
 * Options:          ResamplingMethod -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TimeSeriesThread
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesThread.html
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
fun timeSeriesThread(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesThread", arguments.toMutableList(), options)
}
