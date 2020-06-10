package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FilteredEntityClass
 * 
 * Full name:        System`FilteredEntityClass
 * 
 *                   FilteredEntityClass[class, f] represents a class of entities where only entities for which the EntityFunction object f yields True are kept.
 * Usage:            FilteredEntityClass[class, prop] represents a class of entities where only entities for which the property prop is True are kept.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FilteredEntityClass
 * Documentation:    web: http://reference.wolfram.com/language/ref/FilteredEntityClass.html
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
fun filteredEntityClass(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FilteredEntityClass", arguments.toMutableList(), options)
}
