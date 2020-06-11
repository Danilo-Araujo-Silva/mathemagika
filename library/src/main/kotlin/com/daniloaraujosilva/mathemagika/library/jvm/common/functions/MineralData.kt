package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MineralData
 *
 * Full name:        System`MineralData
 *
 *                   MineralData[entity, property] gives the value of the specified property for the mineral entity.
 *                   MineralData[{entity , entity , …}, property] gives a list of property values for the specified mineral entities.
 *                                      1        2
 * Usage:            MineralData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MineralData
 * Documentation:    web: http://reference.wolfram.com/language/ref/MineralData.html
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
fun mineralData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MineralData", arguments.toMutableList(), options)
}
