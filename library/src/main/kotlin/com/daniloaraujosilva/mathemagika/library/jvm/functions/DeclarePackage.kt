package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeclarePackage
 *
 * Full name:        System`DeclarePackage
 *
 *                   DeclarePackage["context`", {"name ", "name ", …}] declares that Needs["context`"] should automatically be executed if a symbol with any of the specified names is ever used.
 * Usage:                                             1        2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DeclarePackage
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeclarePackage.html
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
fun declarePackage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeclarePackage", arguments.toMutableList(), options)
}
