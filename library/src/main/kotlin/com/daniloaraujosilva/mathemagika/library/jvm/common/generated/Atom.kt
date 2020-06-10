package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Atom
 * 
 * Full name:        System`Atom
 * 
 *                   Atom["sym"] represents an atom with atomic symbol "sym".
 * Usage:            Atom["sym", name  value, …] represents an atom with atomic symbol "sym" and specified properties.
 * 
 * Options:
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Atom
 * Documentation:    web: http://reference.wolfram.com/language/ref/Atom.html
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
fun atom(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Atom", arguments.toMutableList(), options)
}
