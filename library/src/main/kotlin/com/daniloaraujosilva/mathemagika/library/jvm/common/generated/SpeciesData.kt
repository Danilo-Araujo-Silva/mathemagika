package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SpeciesData
 * 
 * Full name:        System`SpeciesData
 * 
 *                   SpeciesData[name, property] gives the value of the specified property for the species entity.
 *                   SpeciesData[{entity , entity , …}, property] gives a list of property values for the specified species entities.
 *                                      1        2
 * Usage:            SpeciesData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/SpeciesData
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpeciesData.html
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
fun speciesData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpeciesData", arguments.toMutableList(), options)
}
