package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PersistenceLocation
 *
 * Full name:        System`PersistenceLocation
 *
 *                   PersistenceLocation["type"] represents a persistence location of the given type.
 * Usage:            PersistenceLocation["type", base] includes the base address for a location type that allows multiple locations.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PersistenceLocation
 * Documentation:    web: http://reference.wolfram.com/language/ref/PersistenceLocation.html
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
fun persistenceLocation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PersistenceLocation", arguments.toMutableList(), options)
}
