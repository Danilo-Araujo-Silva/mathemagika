package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             IncludeAromaticBonds
 *
 * Full name:        System`IncludeAromaticBonds
 *
 * Usage:            IncludeAromaticBonds is an option for Molecule that specifies whether aromatic bonds should be detected and labeled.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IncludeAromaticBonds
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeAromaticBonds.html
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
fun includeAromaticBonds(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeAromaticBonds", arguments.toMutableList(), options)
}
