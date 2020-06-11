package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GenerateDocument
 *
 * Full name:        System`GenerateDocument
 *
 *                   GenerateDocument[nb] generates a document by evaluating all template elements in the notebook nb.
 *                   GenerateDocument[nb, args] generates a document using args to fill template slots.
 *                   GenerateDocument[nb, output] writes the generated document in the output file represented by output.
 * Usage:            GenerateDocument[nb, args, output] uses args to fill template slots and puts the result in output.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GenerateDocument
 * Documentation:    web: http://reference.wolfram.com/language/ref/GenerateDocument.html
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
fun generateDocument(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GenerateDocument", arguments.toMutableList(), options)
}
