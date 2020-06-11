package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ManagedLibraryExpressionQ
 *
 * Full name:        System`ManagedLibraryExpressionQ
 *
 *                   ManagedLibraryExpressionQ[expr] returns True if expr is a managed library expression and False otherwise.
 * Usage:            ManagedLibraryExpressionQ[expr, mname] only returns True if expr is associated with the registered manager having name mname.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ManagedLibraryExpressionQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ManagedLibraryExpressionQ.html
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
fun managedLibraryExpressionQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ManagedLibraryExpressionQ", arguments.toMutableList(), options)
}
