package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CanonicalName
 *
 * Full name:        System`CanonicalName
 *
 *                   CanonicalName[entity] gives the canonical name for the entity specified by entity.
 *                   CanonicalName[{entity , …, entity }] gives the canonical name for entity  through entity .
 * Usage:                                 1           n                                      1               n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CanonicalName
 * Documentation:    web: http://reference.wolfram.com/language/ref/CanonicalName.html
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
fun canonicalName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CanonicalName", arguments.toMutableList(), options)
}
