package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Initialize
 *
 * Full name:        System`Initialize
 *
 *                   Initialize[sym] initializes the symbol sym from persistent values on the default persistence path.
 *                   Initialize[sym, {loc , …}] initializes the symbol sym from persistent values on the persistence path {loc , …}.
 *                                       1                                                                                    1
 * Usage:            Initialize["patt"] initializes all variables matching the string pattern "patt".
 *
 * Options:          MergingFunction -> Automatic
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Initialize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Initialize.html
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
fun initialize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Initialize", arguments.toMutableList(), options)
}
