package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IconizedObject
 *
 * Full name:        System`IconizedObject
 *
 * Usage:            System`IconizedObject
 *
 * Options:          Method -> Automatic
 *
 *                   HoldFirst
 *                   Protected
 *                   ReadProtected
 * Attributes:       SequenceHold
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
fun iconizedObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IconizedObject", arguments.toMutableList(), options)
}
