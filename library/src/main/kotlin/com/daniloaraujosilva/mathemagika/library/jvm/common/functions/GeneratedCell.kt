package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeneratedCell
 *
 * Full name:        System`GeneratedCell
 *
 * Usage:            GeneratedCell is an option for Cell that indicates whether the cell was generated from the kernel.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GeneratedCell
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeneratedCell.html
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
fun generatedCell(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeneratedCell", arguments.toMutableList(), options)
}
