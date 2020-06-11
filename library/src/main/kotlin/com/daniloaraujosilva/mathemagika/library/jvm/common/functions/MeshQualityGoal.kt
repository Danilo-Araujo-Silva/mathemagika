package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeshQualityGoal
 *
 * Full name:        System`MeshQualityGoal
 *
 * Usage:            MeshQualityGoal is an option for DiscretizeRegion and related functions that specifies a mesh cell quality goal for the result.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshQualityGoal
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshQualityGoal.html
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
fun meshQualityGoal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshQualityGoal", arguments.toMutableList(), options)
}
