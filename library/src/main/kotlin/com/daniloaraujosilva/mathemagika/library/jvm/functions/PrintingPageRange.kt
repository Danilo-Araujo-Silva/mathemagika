package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PrintingPageRange
 *
 * Full name:        System`PrintingPageRange
 *
 * Usage:            PrintingPageRange is an option for notebooks that specifies the range of pages of a notebook to be printed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrintingPageRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrintingPageRange.html
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
fun printingPageRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrintingPageRange", arguments.toMutableList(), options)
}
