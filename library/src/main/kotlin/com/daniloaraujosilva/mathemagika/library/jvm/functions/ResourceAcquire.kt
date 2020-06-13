package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ResourceAcquire
 *
 * Full name:        System`ResourceAcquire
 *
 * Usage:            System`ResourceAcquire
 *
 *                   ResourceSystemBase :> Automatic
 *                   ResourceVersion -> Automatic
 *                   WolframLanguageVersion -> Automatic
 * Options:          AddToAccount -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun resourceAcquire(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResourceAcquire", arguments.toMutableList(), options)
}
