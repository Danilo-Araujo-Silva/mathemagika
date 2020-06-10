package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ProteinData
 * 
 * Full name:        System`ProteinData
 * 
 *                   ProteinData[entity] gives the reference amino acid sequence for the protein entity.
 *                   ProteinData[entity, property] gives the value of the specified property for the protein entity.
 * Usage:            ProteinData[entity, property, annotation] gives the specified annotation associated with the given property.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ProteinData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProteinData.html
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
fun proteinData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProteinData", arguments.toMutableList(), options)
}
