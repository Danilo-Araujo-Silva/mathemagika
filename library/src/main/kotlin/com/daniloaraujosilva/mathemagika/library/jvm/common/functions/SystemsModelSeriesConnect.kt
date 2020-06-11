package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemsModelSeriesConnect
 *
 * Full name:        System`SystemsModelSeriesConnect
 *
 *                   SystemsModelSeriesConnect[sys , sys ] connects systems models sys  and sys  in series.
 *                                                1     2                             1        2
 *                   SystemsModelSeriesConnect[sys , sys , {{out  , in  }, …}] connects outputs out   of sys  to inputs in   of sys .
 * Usage:                                         1     2       11    21                           1i       1             2i       2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SystemsModelSeriesConnect
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemsModelSeriesConnect.html
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
fun systemsModelSeriesConnect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemsModelSeriesConnect", arguments.toMutableList(), options)
}
