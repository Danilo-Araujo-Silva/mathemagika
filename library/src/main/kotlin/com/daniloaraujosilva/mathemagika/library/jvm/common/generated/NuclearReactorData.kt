package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NuclearReactorData
 * 
 * Full name:        System`NuclearReactorData
 * 
 *                   NuclearReactorData[entity, property] gives the value of the specified property for the nuclear reactor entity.
 *                   NuclearReactorData[{entity , entity , …}, property] gives a list of property values for the specified nuclear reactor entities.
 *                                             1        2
 * Usage:            NuclearReactorData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NuclearReactorData
 * Documentation:    web: http://reference.wolfram.com/language/ref/NuclearReactorData.html
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
fun nuclearReactorData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NuclearReactorData", arguments.toMutableList(), options)
}
