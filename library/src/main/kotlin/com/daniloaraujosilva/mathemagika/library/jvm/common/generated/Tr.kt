package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Tr
 * 
 * Full name:        System`Tr
 * 
 *                   Tr[list] finds the trace of the matrix or tensor list. 
 *                   Tr[list, f] finds a generalized trace, combining terms with f instead of Plus. 
 * Usage:            Tr[list, f, n] goes down to level n in list. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Tr
 * Documentation:    web: http://reference.wolfram.com/language/ref/Tr.html
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
fun tr(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Tr", arguments.toMutableList(), options)
}
