package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Needs
 *
 * Full name:        System`Needs
 *
 *                   Needs["context`"] loads an appropriate file if the specified context is not already in $Packages.
 * Usage:            Needs["context`", "file"] loads file if the specified context is not already in $Packages.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Needs
 * Documentation:    web: http://reference.wolfram.com/language/ref/Needs.html
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
fun needs(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Needs", arguments.toMutableList(), options)
}
