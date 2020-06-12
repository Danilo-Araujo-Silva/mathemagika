package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WolframAlphaQuantity
 *
 * Full name:        System`WolframAlphaQuantity
 *
 * Usage:            System`WolframAlphaQuantity
 *
 *                   Appearance -> Automatic
 *                   Accuracy -> Automatic
 * Options:          Precision -> Automatic
 *
 *                   NHoldFirst
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
fun wolframAlphaQuantity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WolframAlphaQuantity", arguments.toMutableList(), options)
}
