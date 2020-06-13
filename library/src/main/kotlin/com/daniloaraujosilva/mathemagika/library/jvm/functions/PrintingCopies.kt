package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PrintingCopies
 *
 * Full name:        System`PrintingCopies
 *
 * Usage:            PrintingCopies is an option for notebooks that specifies the number of copies of a notebook printed when a print command is given.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrintingCopies
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrintingCopies.html
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
fun printingCopies(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrintingCopies", arguments.toMutableList(), options)
}
