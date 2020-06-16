package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LatticeData
 *
 * Full name:        System`LatticeData
 *
 *                   LatticeData[lattice, "property"] gives the specified property for a lattice.
 * Usage:            LatticeData[n] gives a list of named lattices of dimension n.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LatticeData
 * Documentation:    web: http://reference.wolfram.com/language/ref/LatticeData.html
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
fun latticeData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LatticeData", arguments.toMutableList(), options)
}
