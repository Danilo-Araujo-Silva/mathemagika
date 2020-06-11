package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CommonName
 *
 * Full name:        System`CommonName
 *
 *                   CommonName[entity] gives the common name for the entity specified by entity.
 *                   CommonName[{entity , …, entity }] gives the common name for entity  through entity .
 * Usage:                              1           n                                   1               n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CommonName
 * Documentation:    web: http://reference.wolfram.com/language/ref/CommonName.html
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
fun commonName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CommonName", arguments.toMutableList(), options)
}
