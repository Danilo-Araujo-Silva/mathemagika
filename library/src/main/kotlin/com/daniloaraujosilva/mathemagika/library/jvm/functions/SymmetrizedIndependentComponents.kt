package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SymmetrizedIndependentComponents
 *
 * Full name:        System`SymmetrizedIndependentComponents
 *
 * Usage:            SymmetrizedIndependentComponents[dims, sym] gives the list of independent components of an array of dimensions dims with the symmetry sym.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SymmetrizedIndependentComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/SymmetrizedIndependentComponents.html
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
fun symmetrizedIndependentComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SymmetrizedIndependentComponents", arguments.toMutableList(), options)
}
