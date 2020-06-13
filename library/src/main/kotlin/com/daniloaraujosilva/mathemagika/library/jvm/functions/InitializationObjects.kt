package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InitializationObjects
 *
 * Full name:        System`InitializationObjects
 *
 *                   InitializationObjects[] gives the list of all persistent initialization objects in all locations in $PersistencePath.
 *                   InitializationObjects["patt"] gives all persistent initialization objects for symbols matching the string pattern "patt".
 *                   InitializationObjects["patt", loc] gives all matching persistent initialization objects in the persistence location loc.
 *                   InitializationObjects["patt", {loc , …}] gives all matching persistent initialization objects in all the loc .
 * Usage:                                              1                                                                         i
 *
 * Options:          EvaluationEnvironment :> $EvaluationEnvironment
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InitializationObjects
 * Documentation:    web: http://reference.wolfram.com/language/ref/InitializationObjects.html
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
fun initializationObjects(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InitializationObjects", arguments.toMutableList(), options)
}
