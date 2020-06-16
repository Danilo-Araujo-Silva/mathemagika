package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CreateManagedLibraryExpression
 *
 * Full name:        System`CreateManagedLibraryExpression
 *
 * Usage:            CreateManagedLibraryExpression[mname, f] creates a managed library expression by applying f to a positive integer ID associated with a registered manager with name mname.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CreateManagedLibraryExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateManagedLibraryExpression.html
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
fun createManagedLibraryExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateManagedLibraryExpression", arguments.toMutableList(), options)
}
