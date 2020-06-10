package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StandardOceanData
 * 
 * Full name:        System`StandardOceanData
 * 
 *                   StandardOceanData[spec] returns the thermodynamic properties of seawater for the specified parameters.
 * Usage:            StandardOceanData[spec, property] returns the specified property for the given parameters. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/StandardOceanData
 * Documentation:    web: http://reference.wolfram.com/language/ref/StandardOceanData.html
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
fun standardOceanData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StandardOceanData", arguments.toMutableList(), options)
}
