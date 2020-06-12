package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Import
 *
 * Full name:        System`Import
 *
 *                   Import[source] imports data from source, returning a Wolfram Language representation of it.
 *                   Import[source, "format"] takes the file to be in the specified format.
 *                   Import[source, elements] imports the specified elements from a file.
 * Usage:            Import[path, …, options] uses the specified options.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Import
 * Documentation:    web: http://reference.wolfram.com/language/ref/Import.html
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
fun `import`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Import", arguments.toMutableList(), options)
}
