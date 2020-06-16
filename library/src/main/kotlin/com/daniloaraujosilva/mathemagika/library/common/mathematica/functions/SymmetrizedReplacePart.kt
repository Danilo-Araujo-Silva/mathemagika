package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SymmetrizedReplacePart
 *
 * Full name:        System`SymmetrizedReplacePart
 *
 *                   SymmetrizedReplacePart[sa, {pos   val , pos   val , …}] replaces independent values of the symmetrized array sa as given by the rules pos   val .
 * Usage:                                           1      1     2      2                                                                                       i      i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SymmetrizedReplacePart
 * Documentation:    web: http://reference.wolfram.com/language/ref/SymmetrizedReplacePart.html
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
fun symmetrizedReplacePart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SymmetrizedReplacePart", arguments.toMutableList(), options)
}
