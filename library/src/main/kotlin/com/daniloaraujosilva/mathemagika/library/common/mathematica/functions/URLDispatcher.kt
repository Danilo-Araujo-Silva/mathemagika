package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             URLDispatcher
 *
 * Full name:        System`URLDispatcher
 *
 *                   URLDispatcher[{patt   content , patt   content , …}] represents a dispatcher for deployed URLs that specifies that URLs with relative paths matching the string patterns patt  should give content represented by content .
 * Usage:                               1          1      2          2                                                                                                                              i                                           i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLDispatcher
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLDispatcher.html
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
fun uRLDispatcher(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLDispatcher", arguments.toMutableList(), options)
}
