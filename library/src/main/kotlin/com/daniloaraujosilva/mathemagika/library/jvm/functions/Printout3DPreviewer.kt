package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Printout3DPreviewer
 *
 * Full name:        System`Printout3DPreviewer
 *
 * Usage:            Printout3DPreviewer is an option for Printout3D that specifies a previewer for generating outputs to print.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Printout3DPreviewer
 * Documentation:    web: http://reference.wolfram.com/language/ref/Printout3DPreviewer.html
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
fun printout3DPreviewer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Printout3DPreviewer", arguments.toMutableList(), options)
}
