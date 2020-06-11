package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AngleBisector
 *
 * Full name:        System`AngleBisector
 *
 *                   AngleBisector[{q , p, q }] gives the bisector of the interior angle at p formed by the triangle with vertex points p, q  and q .
 *                                   1      2                                                                                               1      2
 *                   AngleBisector[{q , p, q }, "type"] gives the angle bisector of the specified type.
 * Usage:                            1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AngleBisector
 * Documentation:    web: http://reference.wolfram.com/language/ref/AngleBisector.html
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
fun angleBisector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AngleBisector", arguments.toMutableList(), options)
}
