package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AutoGeneratedPackage
 *
 * Full name:        System`AutoGeneratedPackage
 *
 * Usage:            AutoGeneratedPackage is an option for notebooks that specifies whether a package is automatically created when a notebook that contains initialization cells or groups is saved.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AutoGeneratedPackage
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoGeneratedPackage.html
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
fun autoGeneratedPackage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoGeneratedPackage", arguments.toMutableList(), options)
}
