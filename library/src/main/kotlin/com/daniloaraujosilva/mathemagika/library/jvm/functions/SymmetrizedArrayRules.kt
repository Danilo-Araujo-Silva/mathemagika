package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SymmetrizedArrayRules
 *
 * Full name:        System`SymmetrizedArrayRules
 *
 *                   SymmetrizedArrayRules[sa] returns a list of rules pos   val  of the symmetrized array sa.
 *                                                                        i      i
 *                   SymmetrizedArrayRules[a, sym] returns a list of rules pos   val  of the array a after being symmetrized with symmetry sym.
 * Usage:                                                                     i      i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SymmetrizedArrayRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/SymmetrizedArrayRules.html
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
fun symmetrizedArrayRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SymmetrizedArrayRules", arguments.toMutableList(), options)
}
