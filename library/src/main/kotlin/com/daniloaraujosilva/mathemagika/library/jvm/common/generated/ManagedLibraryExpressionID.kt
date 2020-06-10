package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ManagedLibraryExpressionID
 * 
 * Full name:        System`ManagedLibraryExpressionID
 * 
 *                   ManagedLibraryExpressionID[expr] returns the positive integer ID associated with expr if it is a managed library expression and $Failed otherwise.
 * Usage:            ManagedLibraryExpressionID[expr, mname] only returns the ID if expr is associated with the registered manager having name mname.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ManagedLibraryExpressionID
 * Documentation:    web: http://reference.wolfram.com/language/ref/ManagedLibraryExpressionID.html
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
fun managedLibraryExpressionID(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ManagedLibraryExpressionID", arguments.toMutableList(), options)
}
