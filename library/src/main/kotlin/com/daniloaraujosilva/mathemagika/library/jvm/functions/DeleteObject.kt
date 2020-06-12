package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteObject
 *
 * Full name:        System`DeleteObject
 *
 *                   DeleteObject[obj] deletes the object obj.
 *                   DeleteObject[{obj , obj , …}] deletes all the obj .
 * Usage:                             1     2                         i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeleteObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteObject.html
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
fun deleteObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteObject", arguments.toMutableList(), options)
}
