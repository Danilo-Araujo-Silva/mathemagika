package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Notebooks
 *
 * Full name:        System`Notebooks
 *
 * Usage:            Notebooks[] gives a list of notebooks currently open in the front end.
 *
 * Options:          StorageClass -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Notebooks
 * Documentation:    web: http://reference.wolfram.com/language/ref/Notebooks.html
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
fun notebooks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Notebooks", arguments.toMutableList(), options)
}
