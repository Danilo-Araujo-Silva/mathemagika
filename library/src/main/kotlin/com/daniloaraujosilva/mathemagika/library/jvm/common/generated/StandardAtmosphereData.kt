package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StandardAtmosphereData
 * 
 * Full name:        System`StandardAtmosphereData
 * 
 *                   StandardAtmosphereData[altitude, property] returns the value of the property at the specified geometrical altitude for the chosen model of the standard Earth atmosphere.
 *                   StandardAtmosphereData[layer, property] returns a piecewise symbolic approximation with the range of an atmospheric layer for the property.
 * Usage:            StandardAtmosphereData["SymbolicApproximation", property] returns the full piecewise symbolic approximation for the property.
 * 
 * Options:          Method -> USStandardAtmosphere
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/StandardAtmosphereData
 * Documentation:    web: http://reference.wolfram.com/language/ref/StandardAtmosphereData.html
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
fun standardAtmosphereData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StandardAtmosphereData", arguments.toMutableList(), options)
}
