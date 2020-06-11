package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OverwriteTarget
 *
 * Full name:        System`OverwriteTarget
 *
 * Usage:            OverwriteTarget is an option for functions like CopyFile that specifies whether to overwrite if target files already exist.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OverwriteTarget
 * Documentation:    web: http://reference.wolfram.com/language/ref/OverwriteTarget.html
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
fun overwriteTarget(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OverwriteTarget", arguments.toMutableList(), options)
}
