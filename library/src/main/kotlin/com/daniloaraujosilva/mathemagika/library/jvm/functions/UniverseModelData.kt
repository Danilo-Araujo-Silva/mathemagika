package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UniverseModelData
 *
 * Full name:        System`UniverseModelData
 *
 *                   UniverseModelData[spec] returns properties of the universe based on the default model at specification defined by the time after the Big Bang, the distance to the comoving object, or the redshift of such an object.
 *                   UniverseModelData[spec, model] returns properties of universe model at spec.
 *                   UniverseModelData[spec, property] returns the specified property at the time or distance spec.
 * Usage:            UniverseModelData[spec, property, model] returns the specified property at the time or distance spec for the universe model.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UniverseModelData
 * Documentation:    web: http://reference.wolfram.com/language/ref/UniverseModelData.html
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
fun universeModelData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UniverseModelData", arguments.toMutableList(), options)
}
